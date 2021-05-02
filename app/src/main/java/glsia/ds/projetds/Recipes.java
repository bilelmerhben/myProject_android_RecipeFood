package glsia.ds.projetds;

public class Recipes {

    private String RecipeName;
    private String RecipeIngredients;
    private String RecipeMethodTitle;
    private String Recipe;
    private int Thumbnail;


    public Recipes(String name, String recipeIngredients, String recipeMethodTitle, String recipe, int thumbnail){

        RecipeName = name;
        RecipeIngredients = recipeIngredients;
        RecipeMethodTitle = recipeMethodTitle;
        Recipe = recipe;
        Thumbnail = thumbnail;

    }

    public Recipes() {

    }


    public String getRecipeName(){

        return RecipeName;
    }
    public String getRecipeIngredients(){
        return RecipeIngredients;
    }

    public String getRecipeMethodTitle(){
        return RecipeMethodTitle;
    }

    public String getRecipe(){
        return Recipe;
    }

    public int getThumbnail(){
        return Thumbnail;
    }

    public void setRecipeName(String RecipeName) {
        this.RecipeName = RecipeName;
    }
    public void setRecipeIngredients(String RecipeIngredients) {
        this.RecipeIngredients = RecipeIngredients;
    }
    public void setRecipeMethodTitle(String RecipeMethodTitle) {
        this.RecipeMethodTitle = RecipeMethodTitle;
    }
    public void setRecipe(String Recipe) {
        this.Recipe = Recipe;
    }
    public void setThumbnail(int Thumbnail) {
        this.Thumbnail = Thumbnail;
    }
}
