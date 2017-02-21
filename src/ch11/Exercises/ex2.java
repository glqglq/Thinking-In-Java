package ch11.Exercises;

import java.util.*;

/**
 * Exercise-11.2
 * @author LuckyGong
 *
 */

public class ex2 {
	public static void main(String[] args) {
		Collection<Integer> c = new HashSet<Integer>();
		for(int i = 0;i < 10;i++)
			c.add(i);
		for(int i:c)
			System.out.println(i);
	}
}
