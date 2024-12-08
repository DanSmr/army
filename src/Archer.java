public class Archer extends Soldier implements SpecialAbility, Defend, Attack{

    public Archer(String name, int damage, String type) {
        super(name, damage, type);
    }

    public void specialAttack(){
        System.out.println("Soldier " + name + " deals " + damage + " ice damage");
    }

    public void attack(){
        System.out.println("Soldier " + name + " deals " + damage + " damage");

    }

    public void defend(){
        System.out.println("Soldier " + name + " deals " + damage + " damage");

    }


}
