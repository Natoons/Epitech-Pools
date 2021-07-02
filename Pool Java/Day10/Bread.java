public abstract class Bread implements Food {
    protected float price;
    protected int calories;
    protected int bakingTime = 0;

    protected Bread(float price_, int calories_){
        price = price_;
        calories = calories_;
    }

    public float getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public int getBakingTime() {
        return bakingTime;
    }
}
