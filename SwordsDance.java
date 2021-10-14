import ru.ifmo.se.pokemon.*;

public class SwordsDance extends SpecialMove{
	public SwordsDance(){
		super(Type.NORMAL,0,1);
	}
	protected void applySelfEffects(Pokemon p){
		p.setMod(Stat.ATTACK,2);
	}
	protected java.lang.String describe(){
		return "uses SwordsDance";
	}
}
