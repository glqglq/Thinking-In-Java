package ch09.Exercises;
/**
 * Exercise-9.3
 * @author LuckyGong
 *
 */
abstract class base{
	String name = "base";
	abstract void print();
	base(){print();}
}
public class ex3 extends base{
	String name = "ex3";
	void print(){System.out.println(name);}
	public static void main(String[] args) {
		ex3 e = new ex3();
		e.print();
	}
}
