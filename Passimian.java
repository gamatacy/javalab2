import ru.ifmo.se.pokemon.*;

public class Passimian extends Pokemon{
	public Passimian(String name, int lvl){
		super(name,lvl);
		setStats(100,120,90,40,60,80);
		setType(Type.FIGHTING);
		setMove(new Peck(), new FlashCannon(), new RockSlide(), new DoubleTeam());	
	}
}