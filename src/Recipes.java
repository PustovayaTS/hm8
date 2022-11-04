import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipes {

    private ProductLists products;
    private int totalCost;
    private String recipeName;

    public Recipes(ProductLists prodList, String recipeName) {
        this.products = prodList;
        this.totalCost = prodList.getTotalCost();
        this.recipeName = recipeName;
    }

   public String getProducts() {
        return products.getProductList().toString();
    }

    public int getTotalCost() {
        return totalCost;
    }

    public String getRecipeName() {
        return recipeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return Objects.equals(recipeName, recipes.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }

    @Override
    public String toString() {
        return "Рецепт - " + recipeName + '\n' +
                " стоимость: " + totalCost + '\n' +
                " состав: " + products.getProductList().toString();
    }
}
