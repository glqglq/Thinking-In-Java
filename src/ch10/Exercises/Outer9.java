package ch10.Exercises;
/**
 * Exercise-10.9
 * @author LuckyGong
 *
 */
interface Interface{
	public void func();
}
public class Outer9 {
	static Interface func(){
		class Implement implements Interface{
			public void func(){System.out.println("func()");}
		}
		return new Implement();
	}
	public static void main(String[] args) {
		Interface i = func();
		i.func();
	}
}
