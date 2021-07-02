abstract class Unit implements Fighter{
    protected String name;
    protected int hp;
    protected int ap;
    protected Fighter closeTo;
    protected boolean alive = true;

    protected Unit(String name_, int hp_, int ap_){
        name = name_;
        hp = hp_;
        ap = ap_;
    }

    public void receiveDamage(int damage){
        hp -= damage;
        if (hp <= 0) {
            alive = false;
        }
    }

    public void recoverAP(){
        ap += 7;

        if(ap > 50) {
            ap = 50;
        }
    }

    public boolean moveCloseTo(Fighter fighter) {
        if(fighter == closeTo) {
            return false;
        } else {
            closeTo = fighter;
            System.out.println(name + " is moving closer to " + fighter.getName() + ".");
            return true;
        }
    }

    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }

    public int getAp(){
        return ap;
    }
    
    public Fighter getCloseTo(){
        return closeTo;
    }
}
