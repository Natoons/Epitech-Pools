public class Cat extends Animal {
    private String color;

    protected Cat(String name, String color) {
        super(name, 4, Animal.Type.MAMMAL);
        this.color = color;

        System.out.println(name + ": MEEEOOWWWW");
    }

    protected Cat(String name) {
        super(name, 4, Animal.Type.MAMMAL);
        this.color = "grey";

        System.out.println(name + ": MEEEOOWWWW");
    }

    public void meow() {
        System.out.println(getName() + " the " + color + " kitty is meowing.");
    }
    
    public String getColor() {
        return color;
    }
}
