package ch08.Exercises;
class ex{
	void func1(){System.out.println("ex.func1()");}
	void func2(){func1();}
	static void func3(){System.out.println("ex.func3()");}
}
public class ex10 extends ex{
	@Override void func1(){System.out.println("ex10.func1()");}
	static void func3(){System.out.println("ex10.func3()");}
	public static void main(String[] args) {
		ex10 e = new ex10();
		e.func2();
		e.func3();
	}
}
