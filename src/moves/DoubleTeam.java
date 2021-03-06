package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 0);
    }
    @Override
    public void applyOppEffects(Pokemon p){
        p.setMod(Stat.ACCURACY, -1);
    }
    @Override
    protected String describe(){
        return "Использует Double Team";
    }

}
