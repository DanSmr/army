public class Knight extends Soldier implements SpecialAbility{

    public Knight(String name, int damage, String type) {
        super(name, damage, type);
    }

    public void specialAttack(){
        System.out.println("Soldier " + name + " deals " + damage + " fire damage");
    }


}
