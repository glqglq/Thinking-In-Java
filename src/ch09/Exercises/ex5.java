package ch09.Exercises;
/**
 * Exercise-9.5¡¢6
 * @author LuckyGong
 *
 */
interface Interface{
	void func1();
	void func2();
	void func3();
}
public class ex5 implements Interface{

	@Override
	public void func1() {System.out.println("func1()");}

	@Override
	public void func2() {System.out.println("func2()");}

	@Override
	public void func3() {System.out.println("func3()");}
	public static void main(String[] args) {
		ex5 e = new ex5();
	}
}
