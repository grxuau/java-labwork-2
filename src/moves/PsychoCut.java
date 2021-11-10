package moves;

import ru.ifmo.se.pokemon.*;

public class PsychoCut extends PhysicalMove {
    public PsychoCut(){
        super(Type.PSYCHIC, 70, 100);
    }
    //Effect critPsycho = new Effect().chance(12.5).turns(1).stat(Stat.ATTACK, 2);
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        if (Math.random()<att.getStat(Stat.SPEED)/170){ //170???????????
            return 2;
        }
        else{
            return 1;
        }
    }

    @Override
    protected String describe(){
        return "использует Psycho Cut";
    }
}
