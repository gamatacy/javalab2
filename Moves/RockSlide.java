import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove{
	public RockSlide() {
		super(Type.ROCK,75, 1);
	}

	Effect e = new Effect().turns(1).chance(0.3);

	public void applyOppEffects(Pokemon p){
		Effect.flinch(p);
	}

	protected java.lang.String describe(){
		return "uses RockSlide";
	}
}