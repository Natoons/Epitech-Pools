import java.math.BigDecimal;

public abstract class Menu<D extends Food,  M extends Food> {
    D drink;
    M meal;
    
    public Menu(D drink, M meal){
        this.drink = drink;
        this.meal = meal;
    }
    
    public D getDrink(){
        return drink;
    }
    
    public M getMeal(){
        return meal;
    }
    
    public float getPrice(){
        float price = (drink.getPrice()+meal.getPrice())*0.9f;
        BigDecimal bd = new BigDecimal(price);
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }
}