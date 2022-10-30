import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {

    private String name;
    private int cost;
    private int quantity;

    private boolean purchased;
    private static Set<Product> productList = new HashSet<>();

    public Product(String name, int cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.purchased = false;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static Set<Product> getProductList() {
        return productList;
    }

    public static void addProdList (Product product) throws RuntimeException {
        if (productList.contains(product)){
            throw new RuntimeException();
        } else if (product.getName() == null || product.getName().isEmpty() || product.getCost() == 0 || product.getQuantity() == 0) {
            throw new RuntimeException("Карточка заполнена не полностью");
        }
        productList.add(product);
    }

    public static void removeProdList (Product product) {
        productList.remove(product);
    }

    public static void makePurchased (Product product){
        productList.remove(product);
        product.purchased = true;
        productList.add(product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String purchase;
        if (purchased){
            purchase = "куплено";
        } else {
            purchase = "не куплено";
        }
        return name + " " + cost + " рублей, вес " + quantity + " кг. - " + purchase + "\n";
    }
}




