package ch07.Exercises;
/**
 * Exercise-7.15
 * @author LuckyGong
 *
 */
class MyClass2{
	protected void func(){System.out.println("func()");}
}
public class Ex15 extends MyClass2{
	
	public static void main(String[] args) {
		Ex15 e = new Ex15();
		e.func();
	}
}
