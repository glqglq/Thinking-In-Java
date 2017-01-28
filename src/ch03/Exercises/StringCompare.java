/*
 * Exercise-3.14
 */
package ch03.Exercises;

public class StringCompare {
	static void f(boolean b) {
		if(b == true) 
			System.out.println(true);
		else 
			System.out.println(false);
	}
	public static void main(String[] args) {
		String s = "one";
		String t = "one";
		f(s == t);
		f(s.equals(t));
	}
}
