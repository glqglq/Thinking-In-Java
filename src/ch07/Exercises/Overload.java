package ch07.Exercises;
/**
 * Exercise-7.13
 * @author LuckyGong
 *
 */
class MyClass{
	void func(){System.out.println("func()");}
	void func(int i){System.out.println("func(" + i + ")");}
	void func(String s){System.out.println("func(" + s + ")");}
}
public class Overload extends MyClass{
	void func(double j){System.out.println("func(" + j + ")");}
	public static void main(String[] args) {
		Overload o = new Overload();
		o.func();
		o.func(1.55);
		o.func(1);
		o.func("String");
	}
}
