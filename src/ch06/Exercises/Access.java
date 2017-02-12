package ch06.Exercises;
/**
 * Exercise-6.5
 * @author LuckyGong
 *
 */
class MyClass{
	public int i = 0;
	private int j = 1;
	protected int k = 2;
	int l = 3;
}
public class Access {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		System.out.println(m.i);
		//System.out.println(m.j);
		System.out.println(m.k);
		System.out.println(m.l);
	}
}
