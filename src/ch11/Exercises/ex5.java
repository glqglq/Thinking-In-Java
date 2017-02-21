package ch11.Exercises;

import java.util.*;

import com.sun.javafx.runtime.SystemProperties;

/**
 * Exercise-11.5
 * @author LuckyGong
 *
 */
public class ex5 {
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Integer> ints = new ArrayList<Integer>(7);
		for(int i = 0;i < 7;i++)
			ints.add(i);
		System.out.println("2:" + ints);
		
		Integer i = new Integer(1);
		ints.add(i);
		System.out.println("3:" + ints.contains(i));
		ints.remove(i);
		
		Integer ii = ints.get(2);
		System.out.println("4:" + ii + " " + ints.indexOf(ii));
		
		Integer in = new Integer(6);
		System.out.println("5:" + ints.indexOf(in));
		System.out.println("7:" + ints.remove(ii));
		System.out.println("8:" + ints);
		
		ints.add(3,new Integer(44));
		System.out.println("9:" + ints);
		
		List<Integer> inin = ints.subList(1, 4);
		System.out.println("10:" + inin);
		System.out.println("10:" + ints.containsAll(inin));
		
		Collections.sort(inin);
		System.out.println("Sorted List:" + inin);
		System.out.println("11:" + ints.containsAll(inin));
		
		Collections.shuffle(inin,rand);
		System.out.println("Shuffled subList:" + inin);
		System.out.println("12:" + ints.containsAll(inin));
		
		List<Integer> copy = new ArrayList<Integer>(inin);
		List<Integer> sub = Arrays.asList(ints.get(1),ints.get(4));
		System.out.println("Sub:" + sub);
		copy.containsAll(sub);
		System.out.println("13:" + copy);
		
		copy = new ArrayList<Integer>(ints);
		copy.remove(2);
		System.out.println("14:" + copy);
		
		copy.removeAll(sub);
		System.out.println("15:" + copy);
		
		copy.set(1,new Integer(56));
		System.out.println("16:" + copy);
		
		copy.addAll(2, sub);
		System.out.println("17:" + copy);
		System.out.println("18:" + ints.isEmpty());
		
		ints.clear();
		System.out.println("19:" + ints);
		
		ints.addAll(new ArrayList<Integer>(4));
		System.out.println("21:" + ints);
		
		
	}
}
