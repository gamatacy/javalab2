import ru.ifmo.se.pokemon.*;

public class PoisonJab extends PhysicalMove{
	public PoisonJab(){
		super(Type.POISON,80,1);
	}

	Effect e = new Effect().chance(0.3);

	protected void appleOppEffects(Pokemon p){
		e.poison(p);
	}

	protected java.lang.String describe(){
		return "uses PoisonJab";
	}
}