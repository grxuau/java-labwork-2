package Pokemons;

import moves.Confide;
import moves.FireBlast;
import moves.Rest;
import moves.Scratch;
import ru.ifmo.se.pokemon.Type;

public class Blissey extends Chansey{
    public Blissey(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(255, 10, 10,75,135,55);
        setMove(new Rest(), new Confide(), new Scratch(), new FireBlast());
    }
}
