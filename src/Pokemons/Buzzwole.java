package Pokemons;

import moves.DoubleTeam;
import moves.DrainPunch;
import moves.FocusBlast;
import moves.PsychoCut;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Buzzwole extends Pokemon {
     public Buzzwole(String name, int level) {
         super(name, level);
         setType(Type.FIGHTING);
         setStats(107,139,139,53,53,79);
         setMove(new PsychoCut(), new FocusBlast(), new DrainPunch(), new DoubleTeam());

     }


}
