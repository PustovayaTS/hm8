import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws RuntimeException{


        Product bananas = new Product("бананы", 100, 2);
        // Product bananas1 = new Product("бананы", 70, 2);
        Product oranges = new Product("апельсины", 70, 1);
        Product kiwi = new Product("киви", 80, 1);
        Product potato = new Product("картошка", 50, 10);
        Product onion = new Product("лук", 30, 4);
        Product cucumbers = new Product("огурцы", 150,2);
        Product tomatoes = new Product("помидоры", 170, 3);


        Product.addProdList(bananas);
       // Product.addProdList(bananas1);
        Product.addProdList(kiwi);
        Product.addProdList(potato);
        Product.addProdList(onion);
        Product.addProdList(cucumbers);
        Product.addProdList(tomatoes);
        Product.removeProdList(bananas);
        Product.makePurchased(onion);
        System.out.println(Arrays.toString(Product.getProductList().toArray()));


    }
}