package ch13.Exercises;

import java.util.Arrays;

public class ex9 {
	private static String knights = "Then, wehn you have found the shrubbery, you must cut down thw mightiest tree in the forest... with... a herring!";
	public static void main(String[] args) {
		System.out.println(knights.replaceAll("a|e|i|o|u", "_"));
	}
}
