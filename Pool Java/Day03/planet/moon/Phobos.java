package planet.moon;

public class Phobos {
    private planet.Mars mars;
    private String landingSite;

    public Phobos(planet.Mars planet, String name) {
        landingSite = name;
        mars = planet;

        System.out.println("Phobos placed in orbit.");
    }

    public Phobos(String name) {
        System.out.println("No planet given.");
    }

    public planet.Mars getMars() {
        return mars;
    }

    public String getLandingSite() {
        return landingSite;
    }
}
