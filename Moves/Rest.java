import ru.ifmo.se.pokemon.*;

public class Rest extends SpecialMove{
	public Rest(){
		super(Type.PSYCHIC,0,1);
	}

	Effect e = new Effect().turns(2);

	protected void applySelfEffects(Pokemon p){
		p.setMod(Stat.HP, (int)(-(p.getStat(Stat.HP) - p.getHP())));	
		e.sleep(p);
	}
	protected java.lang.String describe(){
		return "uses Rest";	
	}
}