package ch10.Exercises;
/**
 * Exercise10.18
 * @author LuckyGong
 *
 */
class Outer18{
	static class Inner18{
		Inner18(){System.out.println("Inner18()");}
	}
	Outer18(){System.out.println("Outer18()");}
	Inner18 func(){return new Inner18();}
}
public class ex18 {
	public static void main(String[] args) {
		Outer18.Inner18 i = new Outer18.Inner18();
	}
}
