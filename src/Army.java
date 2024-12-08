import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Army implements SpecialAbility{
    List<Soldier> army = new ArrayList<>();

    public Army(List<Soldier> army) {
        this.army = army;
    }

    public void report(){
        System.out.println("--------REPORT--------");
        for(Soldier soldier:army){
            soldier.report();
        }
    }

    public void attack(){
        System.out.println("--------ATTACK--------");
        for(Soldier soldier:army){
            if(soldier.getType().matches("OFFENSIVE|ADAPTABLE")){
                soldier.attack();
            }
        }
    }

    public void defend(){
        System.out.println("--------DEFEND--------");
        for(Soldier soldier:army){
            if(soldier.getType().matches("DEFENSIVE|ADAPTABLE")){
                soldier.defend();
            }
        }
    }

    public void specialAttack(){
        System.out.println("--------SPECIAL ATTACK--------");
        for(Soldier soldier:army){

                soldier.specialAttack();

        }
    }
}
