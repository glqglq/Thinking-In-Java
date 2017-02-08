package ch05.Exercises;
/**
 * Exercise 5.15
 * @author LuckyGong
 *
 */
class StringClass{
	String s;
	{
		s = "s";
		System.out.println(s);
	}
	StringClass(){
		System.out.println("StringClass()");
	}
}
public class InstanceClauseTest {
	public static void main(String[] args) {
		new StringClass();
	}
}
