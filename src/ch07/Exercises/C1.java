package ch07.Exercises;
/**
 * Exercise-7.5
 * @author LuckyGong
 *
 */
class A1{A1(){System.out.println("Constructor A1()");}}
class B1{B1(){System.out.println("Constructor B1()");}}
public class C1 extends A1{
	B1 b1 = new B1();
	public static void main(String[] args) {
		C1 c1 = new C1();
	}
}
