public class Gecko {
    private String name;
    private int age;

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

    public String getName() {
        return name;
    }

    public void setAge(int nbr) {
        age = nbr;
    }

    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Gecko mimi = new Gecko("mimi");
        Gecko test = new Gecko();
        mimi.hello("Titi");
        mimi.hello(2);
        test.hello("House");
    }
}