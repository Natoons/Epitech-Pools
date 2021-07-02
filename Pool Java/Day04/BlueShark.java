public class BlueShark extends Shark{

    protected BlueShark(String name) {
        super(name);
    }
    
    @Override
    public boolean canEat(Animal animal) {
        if (animal == this) {
            return false;
        } else if (animal.getType() == "fish"){
            return false;
        } else {
            return true;
        }
    }
}
