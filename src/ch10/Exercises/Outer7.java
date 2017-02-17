package ch10.Exercises;
/**
 * Exercise-10.7
 * @author LuckyGong
 *
 */
public class Outer7 {
	private String s;
	
	Outer7(String s){this.s = s;}
	
	private void func(){System.out.println("func() s = " + s);}
	class Inner{
		void ChangeString(String ss){s = ss;func();}
	}
	public static void main(String[] args) {
		Outer7 o = new Outer7("ss");
		o.func();
		Inner i = o.new Inner();
		i.ChangeString("kb");
	}
}
