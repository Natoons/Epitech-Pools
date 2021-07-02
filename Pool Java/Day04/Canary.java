public class Canary extends Animal{
    private int eggs;

    protected Canary(String name) {
        super(name, 2, Animal.Type.BIRD);
        this.eggs = 0;

        System.out.println("Yellow and smart? Here I am!");
    }

    public void layEgg() {
        eggs++;
    }
    
    public int getEggsCount() {
        return eggs;
    }
}
