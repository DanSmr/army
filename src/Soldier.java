public abstract class Soldier implements Defend, Attack{
    String name;
    int damage;
    String type;

    public Soldier(String name, int damage, String type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }

    public void report(){
        System.out.println("Soldier " + getName() + " here. Type - " + getType());
    }

    @Override
    public void defend() {
        System.out.println("Soldier " + getName() + " deals " + getDamage() + " damage");
    }

    @Override
    public void attack() {
        System.out.println("Soldier " + getName() + " deals " + getDamage() + " damage");
    }


    public void specialAttack() {
    }
}
