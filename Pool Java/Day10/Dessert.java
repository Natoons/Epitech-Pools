public abstract class Dessert implements Food {
    protected float price;
    protected int calories;

    protected Dessert(float price_, int calories_){
        price = price_;
        calories = calories_;
    }
    
    public float getPrice() {
        return price;
    }

    public int getCalories() {
       return calories; 
    }
}
