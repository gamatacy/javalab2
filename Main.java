import ru.ifmo.se.pokemon.*;

public class Main {
	public static void main(String args[]){
		Battle b = new Battle();
		Pokemon p1 = new Pokemon("Chuzhoy", 1);
		Pokemon p2 = new Pokemon("Hishnik", 1);
		b.addAlly(p1);
		b.addFoe(p2);
		b.go();
	}
}