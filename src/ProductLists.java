import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ProductLists {
    private Set<Product> productList = new HashSet<>();

    public Set<Product> getProductList() {
        return productList;
    }

    public void addProdList (Product product) throws RuntimeException {
        if (productList.contains(product)){
            throw new RuntimeException();
        } else if (product.getName() == null || product.getName().isEmpty() || product.getCost() == 0 || product.getQuantity() == 0) {
            throw new RuntimeException("Карточка заполнена не полностью");
        }
        productList.add(product);
    }

    public void removeProdList (Product product) {
        productList.remove(product);
    }

    public void makePurchased (Product product){
        productList.remove(product);
        product.setPurchase(true);
        productList.add(product);
    }

    public int getTotalCost(){
        int totalCost = 0;
        for (Product prod: productList) {
            totalCost = prod.getCost()+totalCost;
        }
        return totalCost;
    }
}
