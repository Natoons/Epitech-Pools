public class GreatWhite extends Shark{

    protected GreatWhite(String name) {
        super(name);
    }
    
    @Override
    public boolean canEat(Animal animal) {
        if (animal == this) {
            return false;
        } else if (animal instanceof Canary){
            System.out.println(getName() + ": Next time you try to give me that to eat, I'll eat you instead.");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void eat(Animal animal) {
        if(canEat(animal)) {
            System.out.println(this.getName() + " ate a " + animal.getType() + " named " + animal.getName() + ".");
            if(frenzy) {
                frenzy = false;
            }
            if(animal instanceof Shark) {
                System.out.println(getName() + ": The best meal one could wish for.");
            }
        } else {
            System.out.println(this.getName() + ": It's not worth my time.");
        }
    }
}
