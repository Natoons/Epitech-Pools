abstract class Character implements Movable{
    protected String name;
    protected final String RPGClass;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;

    protected Character(String name_, String RPGClass_) {
        name = name_;
        RPGClass = RPGClass_;
    }

    public void attack(String str) throws WeaponException{
        System.out.println(name + ": Rrrrrrrrr....");
    }

    public void tryToAttack(String str) {
        try {
            attack(str);
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
    }

    public final void unsheathe(){
        System.out.println(name + ": unsheathes his weapon.");
    }

    public void moveRight(){
        System.out.println(name + ": moves right");
    }

    public void moveLeft(){
        System.out.println(name + ": moves left");
    }

    public void moveForward(){
        System.out.println(name + ": moves forward");
    }

    public void moveBack(){
        System.out.println(name + ": moves back");
    }

    public String getName(){
        return name;
    }

    public String getRPGClass(){
        return RPGClass;
    }

    public int getLife(){
        return life;
    }

    public int getAgility(){
        return agility;
    }

    public int getStrength(){
        return strength;
    }

    public int getWit(){
        return wit;
    }
}