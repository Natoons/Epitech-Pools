public class Gecko {
    private String name;

    public Gecko() {
        setName("Unknown");
        System.out.println("Hello!");
    }

    public Gecko(String str) {
        setName(str);
        System.out.println("Hello " + name + "!");
    }

    public String getName() {
        return name;
    }

    public void setName(String str) {
        name = str;
    }

    public static void main(String[] args) {
        Gecko arthur = new Gecko("Arthur");
        Gecko benjy = new Gecko();

        System.out.println(arthur.getName());
        System.out.println(benjy.getName());
    }
}