import ru.ifmo.se.pokemon.*;

public class Loudred extends Whismur{
	public Loudred(String name, int lvl){
		super(name,lvl);
		setStats(84,71,43,71,43,48);
		setType(Type.NORMAL);
		setMove(new SwordsDance(), new Blizzard(), new SmartStrike());
	}
}