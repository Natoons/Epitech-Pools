public class Mage extends Character{

    protected Mage(String name_) {
        super(name_, "Mage");
        life = 70;
        strength = 3;
        agility = 10;
        wit = 10;

        System.out.println(name + ": May the gods be with me.");
    }
    
    @Override
    public void attack(String str) throws WeaponException{
        if (str == "magic" || str == "wand"){
            System.out.println(name + ": Rrrrrrrrr....");
            System.out.println(name + ": Feel the power of my " + str + "!");
        } else {
            if(str == ""){
                throw new WeaponException(name + ": I refuse to fight with my bare hands.");
            } else {
                throw new WeaponException(name + ": I don't need this stupid " + str + "! Don't misjudge my powers!");
            }
        }
    }

    @Override
    public void moveRight(){
        System.out.println(name + ": moves right furtively.");
    }

    @Override
    public void moveLeft(){
        System.out.println(name + ": moves left furtively.");
    }

    @Override
    public void moveForward(){
        System.out.println(name + ": moves forward furtively.");
    }

    @Override
    public void moveBack(){
        System.out.println(name + ": moves back furtively.");
    }
}
