package ch06.Exercises;
class MyClass2{
	protected int i = 0;
	static void ChangeData(MyClass2 m,int j){
		m.i = j;
	}
}
public class ProtectedData {
	public static void main(String[] args) {
		MyClass2 m = new MyClass2();
		System.out.println(m.i);
		MyClass2.ChangeData(m, 2);
		System.out.println(m.i);
	}
}
