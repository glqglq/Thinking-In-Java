package ch05.Exercises;
/**
 * Exercise-5.7
 * @author LuckyGong
 *
 */
class Aso {
	void bark() {System.out.println("woof");}
} 	
public class ClassWithoutConstructor {
	public static void main(String[] args) {
		Aso a = new Aso();
		a.bark();
	}
}
