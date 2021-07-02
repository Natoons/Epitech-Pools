import chocolate.*;
import planet.*;

public class Astronaut {
    private int id;
    private static int count = 0;
    private String name;
    private String destination;
    private int snacks;

    public Astronaut(String name) {
        id = count++;
        this.name = name;

        System.out.println(this.name + " ready for launch!");
    }

    public void doActions() {
        System.out.println(this.name + ": Nothing to do.");
        if(destination == null) {
            System.out.println(this.name + ": I may have done nothing, but I have " + snacks + " Mars to eat at least!");
        }
    }

    public void doActions(chocolate.Mars mars) {
        snacks += 1;
        System.out.println(this.name + ": Thanks for this mars number " + mars.getId());
        if(destination == null) {
            System.out.println(this.name + ": I may have done nothing, but I have " + snacks + " Mars to eat at least!");
        }
    }

    public void doActions(planet.Mars mars) {
        destination = mars.getLandingSite();
        System.out.println(this.name + ": Started a mission!");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDestination() {
        return destination;
    }

    public int getSnacks() {
        return snacks;
    }

    // public static void main(String[] args) {
    //     // Astronaut mutta = new Astronaut("Mutta");
    //     // Astronaut hibito = new Astronaut("Hibito");
    //     // System.out.println(mutta.getId());
    //     // System.out.println(hibito.getId());

    //     // chocolate.Mars snack = new chocolate.Mars();
    //     // planet.Mars rock = new planet.Mars("Viking 1");
    //     // System.out.println(snack.getId());
    //     // System.out.println(rock.getId());
    //     // System.out.println(rock.getLandingSite());

    //     // Astronaut mutta = new Astronaut("Mutta");
    //     // chocolate.Mars snack = new chocolate.Mars();
    //     // planet.Mars rock = new planet.Mars("Viking 1");
    //     // mutta.doActions();
    //     // mutta.doActions(snack);
    //     // mutta.doActions(rock);

    //     // planet.Mars titi = new planet.Mars("Here and there");
    //     // planet.Mars toto = new planet.Mars("Up");
    //     // new planet.moon.Phobos(titi, "Alpha 3");
    //     // new planet.moon.Phobos(toto, "Beta 1");
    //     // new planet.moon.Phobos("Delta 2");

    //     // Astronaut mutta = new Astronaut("Mutta");
    //     // Astronaut hibito = new Astronaut("Hibito");
    //     // Astronaut serika = new Astronaut("Serika");

    //     // Team spaceBro = new Team("SpaceBrothers");

    //     // spaceBro.add(mutta);
    //     // spaceBro.add(hibito);
    //     // spaceBro.add(serika);

    //     // System.out.println(spaceBro.countMembers());

    //     // planet.Mars titi = new planet.Mars("Hill");
    //     // mutta.doActions(titi);

    //     // spaceBro.showMembers();
    //     // spaceBro.remove(hibito);
    //     // System.out.println(spaceBro.countMembers());

    //     // chocolate.Mars snack = new chocolate.Mars();
    //     // planet.Mars rock = new planet.Mars("Test");

    //     // spaceBro.doActions();
    //     // spaceBro.doActions(snack);
    //     // spaceBro.doActions(rock);

    // }
}
