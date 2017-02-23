package ch12.Exercises;
/**
 * Exercise-12.10
 * @author LuckyGong
 *
 */
class MyException7 extends Exception{
	MyException7(String s){super(s);}
}
public class ex10 {
	static void f() throws Exception{
		try {
			g();
		} catch (Exception e) {
			//throw new Exception("Exception!!!");//Exercise-12.11
			throw new RuntimeException(e);//Exercise-12.11
		}
	}
	static void g() throws MyException7{
		throw new MyException7("MyException!!!");
	}
	public static void main(String[] args) {
		try {
			f();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
