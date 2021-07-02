abstract class Weapon {
    protected String name;
    protected int apcost;
    protected int damage;
    protected boolean melee;
    protected int count;

    protected Weapon(String name_, int apcost_, int damage_, boolean melee_, int count_) {
        this.name = name_;
        this.apcost = apcost_;
        this.damage = damage_;
        this.melee = melee_;
        this.count = count_;
    }

    protected Weapon(String name_, int apcost_, int damage_, boolean melee_) {
        this.name = name_;
        this.apcost = apcost_;
        this.damage = damage_;
        this.melee = melee_;
    }

    abstract public void attack();

    public String getName(){
        return name;
    }

    public int getApcost(){
        return apcost;
    }

    public int getDamage(){
        return damage;
    }

    public boolean isMelee(){
        return melee;
    }
    
    public int getCount(){
        return count;
    }

    public void setCount(int i) {
        count -= 1;
    }
}