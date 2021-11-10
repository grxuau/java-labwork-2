package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FireBlast extends SpecialMove {
    public FireBlast(){
        super(Type.FIRE, 110, 85);

    }
    public void applyOopEffects(Pokemon p){
        if (Math.random()*101 < 10){
            Effect.burn(p);
        }
    }
    @Override
    protected String describe(){
        return "использует Fire Blast";
    }
}
