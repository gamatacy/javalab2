import ru.ifmo.se.pokemon.*;

public class Karrablast extends Pokemon{
	public Karrablast(String name, int lvl){
		super(name,lvl);
		setStats(50,75,45,40,45,60);
		setType(Type.BUG);
		setMove(new DoubleTeam(),new DreamEater(), new Rest());
	}
}