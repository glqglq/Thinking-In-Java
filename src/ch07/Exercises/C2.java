package ch07.Exercises;
/**
 * Exercise-7.7
 * @author LuckyGong
 *
 */
class A2{A2(int i){System.out.println("Constructor A1(" + i + ")");}}
class B2{B2(int i){System.out.println("Constructor B1(" + i + ")");}}
public class C2 extends A2{
	C2() {
		super(2);
	}
	B2 b2 = new B2(1);
	public static void main(String[] args) {
		C2 c2 = new C2();
	}
}
