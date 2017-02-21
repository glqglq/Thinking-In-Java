package ch11.Exercises;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class ex14 {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>(Arrays.asList(new Integer(0),new Integer(1)));
		ListIterator<Integer> lt = li.listIterator();
		for(int i = 2;i <= 5;i++){
			lt = li.listIterator(li.size()/2);
			lt.add(i);
		}
		for(int item:li)
			System.out.println(item);
	}
}
