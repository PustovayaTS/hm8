import java.util.*;

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

        ProductLists firstProdList = new ProductLists();
        ProductLists secondProdList = new ProductLists();

        firstProdList.addProdList(bananas,1);
       // Product.addProdList(bananas1);
        firstProdList.addProdList(kiwi,2);
        firstProdList.addProdList(potato,5);
        firstProdList.addProdList(onion,10);
        secondProdList.addProdList(cucumbers,4);
        secondProdList.addProdList(tomatoes,6);
        secondProdList.removeProdList(bananas);
        firstProdList.makePurchased(onion);

        Recipes salad = new Recipes(firstProdList,"Салат смешанный");
        Recipes salad2 = new Recipes(secondProdList,"Салат летний");
        RecipesList recipesList = new RecipesList();

        recipesList.addRecipesList(salad);
        recipesList.addRecipesList(salad2);
        System.out.println(Arrays.toString(recipesList.getRecipesList().toArray()));

    }
}