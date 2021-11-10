package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DrainPunch extends PhysicalMove {
    public DrainPunch() {
        super(Type.FIGHTING, 75, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, (int) p.getHP()/2); //ok
    }
    @Override
    protected String describe(){
        return "использует Drain Punch";
    }

}
