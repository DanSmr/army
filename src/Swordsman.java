public class Swordsman extends Soldier{

    public Swordsman(String name, int damage, String type) {
        super(name, damage, type);
    }

    public void specialAttack(){
        System.out.println("Soldier " + name + " deals " + damage + " lightning damage");
    }

}
