public class Swordsman extends Soldier implements SpecialAbility, Attack{

    public Swordsman(String name, int damage, String type) {
        super(name, damage, type);
    }

    public void specialAttack(){
        System.out.println("Soldier " + name + " deals " + damage + " lightning damage");
    }

    public void attack(){
        System.out.println("Soldier " + name + " deals " + damage + " damage");

    }

}
