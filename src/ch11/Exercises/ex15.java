package ch11.Exercises;
/**
 * Exercise-11.15
 * @author LuckyGong
 *
 */
import java.util.Stack;
public class ex15 {
	public static void main(String[] args) {
		String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
		Stack c = new Stack();
		for(int i = 0;i < s.length();i++)
			c.push(s.charAt(i));
		int len = c.size();
		for(int i = 0;i < len;i++)
			System.out.println(c.pop());
		
		
	}
}
