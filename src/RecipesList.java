import java.util.HashSet;
import java.util.Set;

public class RecipesList {
    private Set<Recipes> recipesList = new HashSet<>();

    public Set<Recipes> getRecipesList() {
        return recipesList;
    }

    public void addRecipesList (Recipes recipes) throws RuntimeException {
        if (recipesList.contains(recipes)){
            throw new RuntimeException();
        }
        recipesList.add(recipes);
    }

}
