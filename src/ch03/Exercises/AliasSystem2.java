package ch03.Exercises;
/*Exercise-3.3
 * */
class MyClass2{
	float f;
}

public class AliasSystem2 {
	static void f(MyClass2 t){
		t.f = 1.0f;
	}
	public static void main(String[] args) {
		MyClass2 m1 = new MyClass2();
		m1.f = 2.0f;
		f(m1);
		System.out.println(m1.f);
		
	}
}
