package ch13.Exercises;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex16 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("",Pattern.CASE_INSENSITIVE|Pattern.MULTILINE);
		Matcher m = p.matcher("");
		int index = 0;
		File[] files = new File("C:\\Users\\LuckyGong\\Desktop\\«Û÷∞").listFiles();
		for(File f:files){
				String s = f.toString();
				m.reset(s);
				while(m.find())
					System.out.println(index++ + ": " + m.group() + ": " + m.start());
					
		}
	}
}