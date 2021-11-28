import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove{
	public Blizzard(){
		super(Type.ICE,120,0.7);
	}

	Effect e = new Effect().chance(0.3);

	protected void applyOppEffects(Pokemon p){
		e.freeze(p);
	}

	protected java.lang.String describe(){
		return "uses Blizzard";
	}
}