package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 0);}
    @Override
    public void applySelfEffects(Pokemon p){
        // Effect.sleep(p) в доках указано, что он спит от одного до 3, тогда лучше сделать эффект,
        // чтобы точно указать, что покемон спит 2 дня
        // Effect timeToDie = new Effect().turns(2).stat(Stat.HP, 1000000); я сначала сделал так лол
        Effect timeToSleep = new Effect().turns(2).condition(Status.SLEEP);
        Effect timeToHeal = new Effect().turns(0).stat(Stat.HP, -10000000); //чтоб наверняка отхилилось)
        p.addEffect(timeToSleep);
        p.addEffect(timeToHeal);}
        @Override
        protected String describe(){
            return "использует Rest";
    }
    /*protected String describe(){
         return "адыхает" */
}
