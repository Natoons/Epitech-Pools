public class Shark extends Animal{
    protected boolean frenzy;

    protected Shark(String name) {
        super(name, 0, Animal.Type.FISH);
        this.frenzy = false;

        System.out.println("A KILLER IS BORN!");
    }
    
    public void smellBlood(Boolean smell) {
        this.frenzy = smell;
    }

    public void status() {
        if(frenzy) {
            System.out.println(getName() + " is smelling blood and wants to kill.");
        } else {
            System.out.println(getName() + " is swimming peacefully.");
        }
    }

    public boolean canEat(Animal animal) {
        if (animal == this) {
            return false;
        } else {
            return true;
        }
    }

    public void eat(Animal animal) {
        if(canEat(animal)) {
            System.out.println(this.getName() + " ate a " + animal.getType() + " named " + animal.getName() + ".");
            if(frenzy) {
                frenzy = false;
            }
        } else {
            System.out.println(this.getName() + ": It's not worth my time.");
        }
    }
}
