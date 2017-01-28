/*
 * Exercise-3.10
 */
package ch03.Exercises;
public class Binary {
	public static void main(String[] args) {
		int i = 1 + 4 + 16 + 64;//Õâ¸öÐ´·¨666£¡
		int j = 2 + 8 + 32 + 128;
		System.out.println(Integer.toBinaryString(i & j));
		System.out.println(Integer.toBinaryString(i | j));
		System.out.println(Integer.toBinaryString(i ^ j));
		System.out.println(Integer.toBinaryString(~i));
		
	}
}
