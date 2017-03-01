package ch13.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex15 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("",Pattern.CASE_INSENSITIVE|Pattern.MULTILINE);
		Matcher m = p.matcher("");
		int index = 0;
		for(String line:new ArrayList<String>(){}){
			m.reset(line);
			System.out.println(index++ + ": " + m.group() + ": " + m.start());
		}
		
	}
}
