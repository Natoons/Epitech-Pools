public class Animal {
    protected enum Type {
        MAMMAL("mammal"),
        FISH("fish"),
        BIRD("bird");

        private final String type;

        Type(final String type){
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    private String name;
    private int legs;
    private Animal.Type type;
    
    private static int numberOfAnimals;
    private static int numberOfMammals;
    private static int numberOfFish;
    private static int numberOfBirds;
    

    protected Animal(String name, int legs, Animal.Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;

        numberOfAnimals++;

        if(type == Type.MAMMAL) {
            numberOfMammals++;
        } else if (type == Type.FISH) {
            numberOfFish++;
        } else if (type == Type.BIRD) {
            numberOfBirds++;
        }

        System.out.println("My name is " + name + " and I am a " + type.getType() + "!");
    }

    public String getName() {
        return this.name;
    }

    public int getLegs() {
        return this.legs;
    }

    public String getType() {
        return type.getType();
    }

    public static int getNumberOfAnimals() {
        if(numberOfAnimals != 1) {
            System.out.println("There are currently " + numberOfAnimals + " animals in our world.");
        } else {
            System.out.println("There is currently " + numberOfAnimals + " animal in our world.");
        }

        return numberOfAnimals;
    }

    public static int getNumberOfMammals() {
        if(numberOfMammals != 1) {
            System.out.println("There are currently " + numberOfMammals + " mammals in our world.");
        } else {
            System.out.println("There is currently " + numberOfMammals + " mammal in our world.");
        }

        return numberOfMammals;
    }

    public static int getNumberOfFish() {
        if(numberOfFish != 1) {
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        } else {
            System.out.println("There is currently " + numberOfFish + " fish in our world.");
        }

        return numberOfFish;
    }

    public static int getNumberOfBirds() {
        if(numberOfBirds != 1) {
            System.out.println("There are currently " + numberOfBirds + " birds in our world.");
        } else {
            System.out.println("There is currently " + numberOfBirds + " bird in our world.");
        }

        return numberOfBirds;
    }

    // public static void main(String[] args) {
    //     // Animal isidore = new Animal("Isidore", 4, Animal.Type.MAMMAL);
    //     // Animal test = new Animal("Isidore", 4, Animal.Type.MAMMAL);
    //     // Animal tset = new Animal("Isidore", 4, Animal.Type.MAMMAL);
    //     // Animal test2 = new Animal("Isidore", 4, Animal.Type.FISH);
    //     // Animal test3 = new Animal("Isidore", 4, Animal.Type.BIRD);
    //     // int total = test3.getNumberOfAnimals();
    //     // int mammals = test3.getNumberOfMammals();
    //     // int birds = test3.getNumberOfBirds();
    //     // int fish = test3.getNumberOfFish();
    //     // System.out.println(total);
    //     // System.out.println(mammals);
    //     // System.out.println(birds);
    //     System.out.println(fish);

    //     // Cat isidore = new Cat("Isidore", "orange");
    //     // System.out.println(isidore.getName () + " has " + isidore.getLegs ()+ " legs  and is a " + isidore.getType () + ".");
    //     // isidore.meow();

    //     // Cat isidure = new Cat("Isidure");
    //     // System.out.println(isidure.getName () + " has " + isidure.getLegs ()+ " legs  and is a " + isidure.getType () + ".");
    //     // isidure.meow();

    //     // Canary  titi = new  Canary("Titi");
    //     // Shark  willy = new  Shark("Willy");
    //     // Animal nemo = new Animal("Nemo", 0, Animal.Type.FISH);
    //     // BlueShark billy = new BlueShark("Billy");
    //     // GreatWhite rex = new GreatWhite("Rex");
    //     // willy.status ();
    //     // willy.smellBlood(true);
    //     // willy.status ();
    //     // titi.layEgg ();
    //     // System.out.println(titi.getEggsCount ());

    //     // willy.eat(titi);
    //     // willy.eat(willy);
    //     // billy.eat(titi);
    //     // billy.eat(nemo);
    //     // rex.eat(titi);
    //     // rex.eat(nemo);
    //     // rex.eat(billy);
    // }
}