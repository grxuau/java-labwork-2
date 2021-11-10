package Pokemons;

import moves.Confide;
import moves.DoubleTeam;
import moves.DracoMeteor;
import moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;

public class Huntail extends Clamperl{
    public Huntail(String name, int level){
        super(name, level);
        setStats(55, 104, 105,94,75,52);
        setMove(new Swagger(), new DoubleTeam(), new Confide(), new DracoMeteor());
    }

}
