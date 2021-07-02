abstract class SpaceMarine extends Unit{
    protected Weapon weapon;

    protected SpaceMarine(String name_, int hp_, int ap_) {
        super(name_, hp_, ap_);
    }
    
    public boolean equip(Weapon weapon){
        if(weapon.getCount() > 0){
            weapon.setCount(1);
            System.out.println(name + " has beem equipped with a " + weapon.getName() + ".");
            return true;
        } else {
            return false;
        }
    }

    public boolean attack(Fighter fighter){
        if (weapon == null){
            System.out.println(name + ": Hey, this is crazy. I'm not going to fight this empty-handed.");
            return false;
        } else {
            if(weapon.melee) {
                if(closeTo != fighter){
                    System.out.println(name + ": I'm too far away from " + fighter.getName());
                    return false;
                }
            }
            if(ap >= weapon.apcost) {
                ap -= weapon.apcost;
                System.out.println(name + " attacks " + fighter.getName() + " with a " + weapon.getName() + ".");
                weapon.attack();
                fighter.receiveDamage(weapon.damage);
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public void recoverAP(){
        ap += 9;
        if(ap > 50){
            ap = 50;
        }
    }

    public Weapon getWeapon(){
        return weapon;
    }
}
