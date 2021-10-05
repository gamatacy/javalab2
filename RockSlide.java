import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove{
	public RockSlide() {
		super(Type.ROCK,75, 1);
	}

	Effect e = new Effect().chance(1).turns(3);

	public void applyOppEffects(Pokemon p){
		e.flinch(p);
		Effect.succes(p);
	}

	protected java.lang.String describe(){
		return "rockrockrock";
	}
}