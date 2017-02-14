package ch09.Exercises;
/**
 * Exercise-9.4
 * @author LuckyGong
 *
 */
abstract class Father{}

class Son extends Father{
	void print(){System.out.println("Son.print()");}
}

public class ex4 {
	static void func(Father f){((Son)f).print();}
	public static void main(String[] args) {
		Son s = new Son();
		ex4.func(s);
	}
}
