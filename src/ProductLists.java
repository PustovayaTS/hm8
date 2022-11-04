import java.util.*;

public class ProductLists {
    private HashMap<Product,Integer> productList = new HashMap<>();

    public HashMap<Product,Integer> getProductList() {
        return productList;
    }

    public void addProdList (Product product, int quantity) throws RuntimeException {
        if (productList.containsKey(product)){
            throw new RuntimeException();
        } else if (product.getName() == null || product.getName().isEmpty() || product.getCost() == 0 || product.getQuantity() == 0) {
            throw new RuntimeException("Карточка заполнена не полностью");
        }
        int localQuantity = 1;
        if (quantity != 0 || quantity > 0){
            localQuantity = quantity;
        }
        productList.put(product,localQuantity);
    }

    public void removeProdList (Product product) {
        productList.remove(product);
    }

    public void makePurchased (Product product){
        int localQuantity = 0;
        localQuantity = productList.get(product);
        productList.remove(product);
        product.setPurchase(true);
        productList.put(product,localQuantity);
    }

    public int getTotalCost(){
        int totalCost = 0;
        for (Map.Entry<Product, Integer> entry: productList.entrySet()) {
            totalCost = entry.getKey().getCost() * entry.getValue()+totalCost;
        }

        return totalCost;
    }

    @Override
    public String toString() {
        return "Список продуктов = " + productList;
    }
}
