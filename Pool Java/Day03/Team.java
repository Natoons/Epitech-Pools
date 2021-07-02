import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Astronaut> members = new ArrayList<Astronaut>();
    private String str;

    public Team(String name) {
        this.name = name;
    }

    public void add(Astronaut astronaut) {
        members.add(astronaut);
    }

    public void remove(Astronaut astronaut) {
        for(int i = 0; i < members.size(); i++) {
            if (members.get(i) == astronaut) {
                members.remove(i);
            }
        }
    }

    public int countMembers() {
        return members.size();
    }

    public void showMembers() {
        if(members.size() != 0) {
            str = name + ": ";

            for(int i = 0; i < members.size() - 1; i++) {
                str += members.get(i).getName();

                if(members.get(i).getDestination() != null) {
                    str += " on mission, ";
                } else {
                    str += " on standby, ";
                }
            }

            if(members.get(members.size() - 1).getDestination() != null) {
                str += members.get(members.size() - 1).getName() + " on mission.";
            } else {
                str += members.get(members.size() - 1).getName() + " on standby.";
            }

            System.out.println(str);
        }
    }

    public void doActions() {
        System.out.println(name + ": Nothing to do.");
    }

    public void doActions(planet.Mars mars) {
        for(int i = 0; i < members.size(); i++) {
            members.get(i).doActions(mars);
        }
    }

    public void doActions(chocolate.Mars mars) {
        for(int i = 0; i < members.size(); i++) {
            members.get(i).doActions(mars);
        }
    }

    public String getName() {
        return name;
    }
}
