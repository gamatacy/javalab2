import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove{
	public DoubleTeam(){
		super(Type.NORMAL,0,1);
	}
	protected void applySelfEffects(Pokemon p){
		p.setMod(Stat.EVASION,1);
	}
	protected java.lang.String describe(){
		return "uses DoubleTeam";
	}		
}