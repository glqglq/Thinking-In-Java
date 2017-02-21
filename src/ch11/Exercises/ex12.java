package ch11.Exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Exercise-11.12
 * @author LuckyGong
 *
 */
public class ex12 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>(10);
		List<Integer> l2 = new ArrayList<Integer>(10);
		for(int i = 0;i < 10;i++)
			l1.add(i);
		for(int i = 10;i < 20;i++)
			l2.add(i);
		Iterator<Integer> l = l1.iterator();
		ListIterator<Integer> li = l2.listIterator();
		int n = 10;
		while(n-- > 0){
			li.next();
		}
		while(l.hasNext()){
			li.previous();
			li.set(l.next());
		}
		
		for(Integer item:l2)
			System.out.println(item);
	}
}
