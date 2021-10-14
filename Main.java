import ru.ifmo.se.pokemon.*;

public class Main {
	public static void main(String args[]){
		Battle b = new Battle();
		Pokemon p1 = new Escavalier("", 15);
		Pokemon p2 = new Karrablast("", 16);
		Pokemon p3 = new Whismur("", 16);
		Pokemon p4 = new Loudred("", 16);
		Pokemon p5 = new Passimian("", 16);		
		Pokemon p6 = new Exploud("", 16);		
		b.addAlly(p1);
		b.addAlly(p2);
		b.addAlly(p3);
		b.addFoe(p4);
		b.addFoe(p5);
		b.addFoe(p6);
		b.go();
	}
}