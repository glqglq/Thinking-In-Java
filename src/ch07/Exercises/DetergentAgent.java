package ch07.Exercises;
class Cleanser{
	private String s = "Cleanser";
	public void append(String a){s += a;}
	public void dilute(){append("dilute()");}
	public void apply(){append("append()");}
	public void scrub(){append("scrub()");}
	public String toString(){return s;}
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		System.out.println(x);
	}
	
}
public class DetergentAgent extends Cleanser{
	Cleanser c = new Cleanser();
	public void scrub(){
		append(" Detergent.scrub()");
		super.scrub();
	}
	@Override
	public void append(String a) {
		c.append(a);
	}
	@Override
	public void dilute() {
		c.dilute();
	}
	@Override
	public void apply() {
		c.apply();
	}
	public void foam(){append("foam()");}
	public static void main(String[] args) {
		DetergentAgent x = new DetergentAgent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
		Cleanser.main(args);
	}
}
