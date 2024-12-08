import java.util.List;

public class Main {
    public static void main(String[] args) {


        Army army = getArmy();
        System.out.println(army);
        army.report();
        System.out.println("\n\n");
        army.attack();
        System.out.println("\n\n");
        army.defend();
        System.out.println("\n\n");
        army.specialAttack();


        }

    private static Army getArmy() {
        Knight Knight1 = new Knight("Knight 1", 5, "DEFENSIVE");
        Knight Knight2 = new Knight("Knight 2", 5, "DEFENSIVE");
        Knight Knight3 = new Knight("Knight 3", 5, "DEFENSIVE");

        Swordsman Swordsman1 = new Swordsman("Swordsman 1", 4, "OFFENSIVE");
        Swordsman Swordsman2 = new Swordsman("Swordsman 2", 4, "OFFENSIVE");
        Swordsman Swordsman3 = new Swordsman("Swordsman 3", 4, "OFFENSIVE");

        Archer Archer1 = new Archer("Archer 1", 2, "ADAPTABLE");
        Archer Archer2 = new Archer("Archer 2", 2, "ADAPTABLE");
        Archer Archer3 = new Archer("Archer 3", 3, "ADAPTABLE");


        return new Army(List.of(Knight1, Knight2, Knight3, Swordsman1, Swordsman2, Swordsman3, Archer1, Archer2, Archer3));
    }
}
