public abstract class Drink implements Food {
    protected float price;
    protected int calories;
    protected boolean aCan = false;

    protected Drink(float price_, int calories_){
        price = price_;
        calories = calories_;
    }

    public float getPrice() {
        return price;
    }

    public int getCalories() {
       return calories; 
    }

    public boolean isACan() {
        return aCan;
    }
}
