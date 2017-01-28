package ch03.Exercises;

/*Exercise-3.2
 * */
class MyClass{
	float f;
}
public class AliasSystem {
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		MyClass m2 = m1;
		m1.f = 1.0f;
		System.out.println(m2.f);
	}
}
