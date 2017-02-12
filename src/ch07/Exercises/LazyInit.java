package ch07.Exercises;
class MyClass1{
	int i = 0;
}
public class LazyInit {
	MyClass1 m;
	public String toString(){
		m = new MyClass1();
		return Integer.toString(m.i);
	}
	public static void main(String[] args) {
		LazyInit l = new LazyInit();
		System.out.println(l.toString());
	}
}
