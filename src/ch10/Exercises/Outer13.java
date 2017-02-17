package ch10.Exercises;
/**
 * Exercise-10.13
 * @author LuckyGong
 *
 */
interface Interface13{
	void func();
}
public class Outer13 {
	public static Interface13 func(){
		return new Interface13(){
			public void func(){System.out.println("func()");}
		};
	}
	public static void main(String[] args) {
		Interface13 i = func();
		i.func();
	}
}
