package ch07.Exercises;
/**
 * Exercise-7.24
 * @author LuckyGong
 *
 */
class Insect{
	private int i = 9;
	protected int j ;
	Insect(){
		System.out.println("i = " + i + ",j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	static int printInit(String s){
		System.out.println(s);
		return 47;
	}
}
class Bettle extends Insect{
	private int k = printInit("Bettle.k initialized");
	public Bettle(){
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	private static int x2 = printInit("static Bettle.x2 initialized");
}
public class Scarab extends Bettle{
	private int l = printInit("Scarab.l initialized");
	public Scarab(){
		System.out.println("j = " + j);
		System.out.println("l = " + l);
	}
	private static int x3 = printInit("static Scarab.x3 initialized");
	public static void main(String[] args) {
		System.out.println("Scarab constructor");
		Scarab sc = new Scarab();			
	}
}
