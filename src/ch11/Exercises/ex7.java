package ch11.Exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise-11.7
 * @author LuckyGong
 *
 */
public class ex7 {
	private int now;
	public ex7(int now) {this.now = now;
	}
	@Override
	public String toString() {return Integer.toString(now);}
	public static void main(String[] args) {
		ArrayList<ex7> exs = new ArrayList<ex7>(14);
		for(int i = 0;i < 14;i++)
			exs.add(new ex7(i));
		List<ex7> subexs =  exs.subList(0, 3);
		exs.removeAll(subexs);
		for(int i = 0;i < 10;i++)
			System.out.println(exs.get(i));
	}
}
