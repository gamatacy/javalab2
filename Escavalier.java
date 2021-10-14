import ru.ifmo.se.pokemon.*;

public class Escavalier extends Karrablast{
	public Escavalier(String name, int lvl){
		super(name,lvl);
		setStats(70,135,105,60,105,20);
		setType(Type.BUG,Type.STEEL);
		setMove(new DreamEater(), new DoubleTeam(), new Rest(), new Headbutt());
	}
}