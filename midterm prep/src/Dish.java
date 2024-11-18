public class Dish extends MenuItem {
    CuisineType cuisineType;
    String mainIngredient;

    public Dish(String name, String code, double price, CuisineType cuisineType, String mainIngredient) {
        super(name, code, price);
        this.cuisineType = cuisineType;
        this.mainIngredient = mainIngredient;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public String getDescription() {
        return "Cuisine type: " + getCuisineType() + ", main ingredient: " + getMainIngredient() + ".";
    }
}
