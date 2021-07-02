public class Gecko {
    private String name;
    private int age;
    private int energy = 100;

    public Gecko() {
        name = "Unknown";
        System.out.println("Hello!");
    }

    public Gecko(String str) {
        name = str;
        System.out.println("Hello " + name + "!");
    }

    public Gecko(String str, int nbr) {
        name = str;
        System.out.println("Hello " + name + "!");
        age = nbr;
    }

    public void status() {
        int nbr = getAge();

        switch(nbr){
            case 0:
                System.out.println("Unborn Gecko");
                break;
            case 1:
                System.out.println("Baby Gecko");
                break;
            case 2:
                System.out.println("Baby Gecko");
                break;
            case 3:
                System.out.println("Adult Gecko");
                break;
            case 4:
                System.out.println("Adult Gecko");
                break;
            case 5:
                System.out.println("Adult Gecko");
                break;
            case 6:
                System.out.println("Adult Gecko");
                break;
            case 7:
                System.out.println("Adult Gecko");
                break;
            case 8:
                System.out.println("Adult Gecko");
                break;
            case 9:
                System.out.println("Adult Gecko");
                break;
            case 10:
                System.out.println("Adult Gecko");
                break;
            case 11:
                System.out.println("Old Gecko");
                break;
            case 12:
                System.out.println("Old Gecko");
                break;
            case 13:
                System.out.println("Old Gecko");
                break;
            default :
                System.out.println("Impossible Gecko");
        }
    }

    public void hello(String str) {
        String string = getName();
        System.out.println("Hello " + str + ", I'm " + string + "!");
    }

    public void hello(int nbr) {
        String string = getName();
        for (int i=0; i < nbr; i++) {
            System.out.println("Hello, I'm " + string + "!");
        }
    }

    // public void eat(String str) {
    //     switch(str.toLowerCase()){
    //         case "meat":
    //             System.out.println("Yummy !");
    //             setEnergy(1);
    //         case "vegetable":
    //             System.out.println("Erk !");
    //             setEnergy(2);
    //         default:
    //             System.out.println("I can't eat this !");
    //     }
    // }

    public void eat(String str) {
        if(str.equalsIgnoreCase("meat")){
            setEnergy(1);
            System.out.println("Yummy !");
        } else if(str.equalsIgnoreCase("vegetable")) {
            setEnergy(2);
            System.out.println("Erk !");
        } else {
            System.out.println("I can't eat this !");
        }
    }

    public void work() {
        if(getEnegy() > 25) {
            System.out.println("I'm working T.T");
            setEnergy(3);
        } else {
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
            setEnergy(4);
        }
    }

    public void fraternize(Gecko gecko) {
        if(getEnegy() < 30) {
            if(gecko.getEnegy() < 30) {
                System.out.println("Not today!");
                System.out.println("Not today!");
            }
            else {
                System.out.println("Sorry " + gecko.getName() + ", I'm too tired to go out tonight.");
                System.out.println("Oh! That's too bad, another time then!");
            }
        } else if(gecko.getEnegy() < 30) {
            System.out.println("Sorry " + getName() + ", I'm too tired to go out tonight.");
            System.out.println("Oh! That's too bad, another time then!");
        } else {
            System.out.println("I'm going to drink with " + gecko.getName() + "!");
            System.out.println("I'm going to drink with " + getName() + "!");
        }
    }

    public void fraternize(Snake snake) {
        if(getEnegy() >= 10) {
            setEnergy(0);
            System.out.println("LET'S RUN AWAY!!!");
        } else {
            System.out.println("...");
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int nbr) {
        age = nbr;
    }

    public int getAge() {
        return age;
    }

    public void setName(String str) {
        name = str;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int nbr) {
        if(nbr == 1) {
            energy += 10;
            if(energy > 100) {
                energy = 100;
            }
        } else if(nbr == 2) {
            energy -= 10;
            if(energy < 0) {
                energy = 0;
            }
        } else if(nbr == 3) {
            energy -= 9;
        } else if (nbr == 4) {
            energy += 50;
        } else if(nbr == 0) {
            energy = 0;
        } else if(nbr == 5) {
            energy = 25;
        } else if(nbr == 6) {
            energy = 8;
        }
    }

    // public static void main(String[] args) {
    //     Gecko mimi = new Gecko("mimi");
    //     Gecko lili = new Gecko("lili");
    //     Gecko titi = new Gecko("titi");
    //     Gecko sisi = new Gecko("sisi");
    //     Snake snake = new Snake();

    //     titi.setEnergy(5);
    //     sisi.setEnergy(6);
        
    //     mimi.fraternize(lili);
    //     mimi.fraternize(titi);
    //     titi.fraternize(sisi);
    //     titi.fraternize(snake);
    //     sisi.fraternize(snake);
    // }
}