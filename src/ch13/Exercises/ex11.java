package ch13.Exercises;

import java.util.regex.Pattern;

public class ex11 {
	public static void main(String[] args) {
		String str = "Arline ate eight apples and one orange while Anita hasn't any";
		Pattern p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
		System.out.println(p.matcher(str).find());
	}
}
