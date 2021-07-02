abstract class Monster extends Unit{
    protected int damage = 0;
    protected int apcost = 0;

    protected Monster(String name_, int hp_, int ap_) {
        super(name_, hp_, ap_);
    }
    
    public boolean equip(Weapon weapon) {
        System.out.println("Monsters are proud and fight with their own bodies.");
        return false;
    }

    public boolean attack(Fighter fighter){
        if(moveCloseTo(fighter)){
            if(ap >= apcost) {
                ap -= apcost;
                System.out.println(name + " attacks " + fighter.getName() + ".");
                fighter.receiveDamage(damage);
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println(name + ": I'm too far away from " + fighter.getName() + ".");
            return false;
        }
    }

    public int getDamage(){
        return damage;
    }

    public int getApcost(){
        return apcost;
    }
}
