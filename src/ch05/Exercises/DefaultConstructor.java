package ch05.Exercises;
/*
 * Exercise-5.3
 */
class Constructor{
	Constructor(){
		System.out.println("Constructor!!!");
	}
}
public class DefaultConstructor {
	public static void main(String[] args) {
		Constructor c = new Constructor();
	}
}
