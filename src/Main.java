import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Blissey happy = new Blissey("Егор", 1);
        Buzzwole buzz = new Buzzwole("Тилль", 2);
        Happiny hap = new Happiny("Позитивный", 1);
        Battle b = new Battle();
        Chansey chance = new Chansey("Базз", 2);
        Huntail hunt = new Huntail("Ханти", 1);
        Clamperl clamp = new Clamperl("Клампи", 1);
        b.addAlly(happy);
        b.addAlly(buzz);
        b.addAlly(hap);
        b.addFoe(chance);
        b.addFoe(hunt);
        b.addFoe(clamp);
        b.go();
    }
}
