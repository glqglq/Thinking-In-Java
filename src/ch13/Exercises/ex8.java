package ch13.Exercises;

import java.util.Arrays;

public class ex8 {
	private static String knights = "Then, wehn you have found the shrubbery, you must cut down thw mightiest tree in the forest... with... a herring!";
	public static void main(String[] args) {
		System.out.println(Arrays.toString(knights.split("the|you")));
	}
}
