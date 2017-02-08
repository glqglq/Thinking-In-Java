package ch05.Exercises;
/**
 * Exercise-5.14
 * @author LuckyGong
 *
 */
class Cupp{
	static String s1 = "s1";
	static String s2;
	static{
		s2 = "s2";
	}
	static void print(){
		System.out.println(s1);
		System.out.println(s2);
	}
}
public class ExplicitStatic2 {
	public static void main(String[] args) {
		Cupp.print();
	}
}
