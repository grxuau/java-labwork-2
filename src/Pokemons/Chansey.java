package Pokemons;

import moves.Confide;
import moves.Rest;
import moves.Scratch;
import ru.ifmo.se.pokemon.Type;

public class Chansey extends Happiny{
    public Chansey(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(250, 5, 5,35, 105, 50);
        setMove(new Rest(), new Confide(), new Scratch());
    }
    public Chansey(){}
}
