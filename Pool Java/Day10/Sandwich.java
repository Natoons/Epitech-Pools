import java.util.ArrayList;
import java.util.List;

public abstract class Sandwich implements Food {
    protected float price;
    protected int calories;
    protected boolean vegeterian = false;
    protected List<String> ingredients = new ArrayList<>();

    protected Sandwich(float price_, int calories_){
        price = price_;
        calories = calories_;
    }
    
    public float getPrice() {
        return price;
    }

    public int getCalories() {
       return calories; 
    }

    public boolean isVegetarian() {
        return vegeterian;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
