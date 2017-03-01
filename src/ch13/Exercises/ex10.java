package ch13.Exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex10 {
	public static void main(String[] args) {
		String str = "Java now has regular expresion";
		Pattern p = Pattern.compile("^Java");
		Matcher m = p.matcher(str);
		System.out.println(m.find());
	}
}
