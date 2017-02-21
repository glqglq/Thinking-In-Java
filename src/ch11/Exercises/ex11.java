package ch11.Exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ex11 {
	static void show(Collection c){
		Iterator<Collection> i = c.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		Collection<Integer> a = new ArrayList<Integer>(10);
		for(int i = 0;i < 10;i++)
			a.add(i);
		show(a);
	}
}
