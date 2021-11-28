import ru.ifmo.se.pokemon.*;

public class Whismur extends Pokemon{
	public Whismur(String name, int lvl){
		super(name,lvl);
		setStats(64,51,23,51,23,28);
		setType(Type.NORMAL);
		setMove(new SwordsDance(), new Blizzard());
	}
}