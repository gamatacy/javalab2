import ru.ifmo.se.pokemon.*;

public class Peck extends PhysicalMove{
	public Peck() {
		super(Type.FLYING,35,1.0);
	}
	protected java.lang.String describe(){
		return "uses Peck";
	}
}