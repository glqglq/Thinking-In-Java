package ch10.Exercises;
/**
 * Exercise-10.26
 * @author LuckyGong
 *
 */
class Outer26{
	class Inner26{
		int i;
		Inner26(int i){this.i = i;System.out.println("Outer26.Inner26()");}
	}
}
public class ex26 {
	class Inner26 extends Outer26.Inner26{
		Inner26(Outer26 o){o.super(5);System.out.println();System.out.println("ex26.Inner26()");}
	}
	public static void main(String[] args) {
		ex26 e = new ex26();
		Outer26 o = new Outer26();
		Inner26 i = e.new Inner26(o);
	}
}
