public class Archer extends Soldier{

    public Archer(String name, int damage, String type) {
        super(name, damage, type);
    }

    public void specialAttack(){
        System.out.println("Soldier " + name + " deals " + damage + " ice damage");
    }


}
