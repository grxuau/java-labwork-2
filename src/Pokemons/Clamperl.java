package Pokemons;

import moves.Confide;
import moves.DoubleTeam;
import moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Clamperl extends Pokemon {
    public Clamperl (String name, int level){
        super(name, level);
        setType(Type.WATER);
        setStats(35, 64 ,85, 74, 55, 32);
        setMove(new Swagger(), new Confide(), new DoubleTeam());
    }
    public Clamperl(){}

}
