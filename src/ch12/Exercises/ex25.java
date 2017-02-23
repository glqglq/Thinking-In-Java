package ch12.Exercises;
/**
 * Exercise-12.25
 * @author LuckyGong
 *
 */
class MyException8 extends Exception{}
class MyException9 extends MyException8{}
class MyException10 extends MyException9{}
class A{
	void func() throws MyException8{ throw new MyException8();}
}
class B extends A{
	void func() throws MyException9{ throw new MyException9();}
}
class C extends B{
	void func() throws MyException10{ throw new MyException10();}
}
public class ex25 {
	public static void main(String[] args) {
		A c = new C();
		try {
			c.func();
		} catch (MyException8 e) {
			e.printStackTrace();
		}
	}
}
