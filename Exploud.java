import ru.ifmo.se.pokemon.*;

public class Exploud extends Loudred{
	public Exploud(String name, int lvl){
		super(name,lvl);
		setStats(104,91,63,91,73,68);
		setType(Type.NORMAL);
		setMove(new SwordsDance(), new Blizzard(), new SmartStrike(), new PoisonJab());
	}
}