import ru.ifmo.se.pokemon.*;

public class Headbutt extends PhysicalMove{
	public Headbutt(){
		super(Type.NORMAL,70,1);
	}

	Effect e = new Effect().chance(0.3);

	protected void applyOppEffects(Pokemon p){
		e.flinch(p);
	}
}