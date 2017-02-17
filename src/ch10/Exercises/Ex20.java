package ch10.Exercises;
/**
 * Exercise-10.20
 * @author LuckyGong
 *
 */
interface Interface20{
	void func();
	class Inner{
		int i = 5;
		void show(){System.out.println(i);}
	}
}
public class Ex20 {
	public static void main(String[] args) {
		Interface20.Inner i = new Interface20.Inner();
	}
}
