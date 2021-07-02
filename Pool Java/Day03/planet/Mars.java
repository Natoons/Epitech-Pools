package planet;

public class Mars {
    private int id;
    private static int count = 0;
    private String landingSite;

    public Mars(String site) {
        id = count++;
        landingSite = site;
    }

    public int getId() {
        return id;
    }

    public String getLandingSite() {
        return landingSite;
    }

    // public static void main(String[] args) {
    //     Mars rocks = new Mars();
    //     Mars lite = new Mars();
    //     Mars snack = new Mars();

    //     System.out.println(rocks.getId());
    //     System.out.println(lite.getId());
    //     System.out.println(snack.getId());
    // }
}