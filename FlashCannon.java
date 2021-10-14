import ru.ifmo.se.pokemon.*;

public class FlashCannon extends SpecialMove{
	public FlashCannon(){
		super(Type.STEEL,80,100);
	}
	protected void applyOppEffects(Pokemon p){
		p.setMod(Stat.DEFENSE,-1);
	}
	protected java.lang.String describe(){
		return "uses FlashCannon";
	}			
}