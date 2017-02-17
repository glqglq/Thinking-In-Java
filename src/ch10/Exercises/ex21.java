package ch10.Exercises;
/**
 * Exercise-10.21
 * @author LuckyGong
 *
 */
interface Interface21{
	void func();
	class Inner{
		static void func(Interface21 i){i.func();System.out.println("Inner.func()");}
	}
}
public class ex21 implements Interface21{
	public void func(){System.out.println("Interface21.func()");}
	public static void main(String[] args) {
		ex21 i = new ex21();
		Interface21.Inner.func(i);
	}
}
