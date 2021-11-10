package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DracoMeteor extends SpecialMove{
    public DracoMeteor(){
        super(Type.DRAGON, 130, 90);
    }
    public void appleSelfEffect(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -2);
    }
    protected String describe(){
        return "использует Draco Meteor";
    }
}
