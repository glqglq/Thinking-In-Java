package ch11.Exercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Exercise-11.18
 * @author LuckyGong
 *
 */
public class ex18 {
	public static void main(String[] args) {
		Map<String,Integer> si = new HashMap();
		si.put("B", 2);
		si.put("A", 1);
		si.put("C", 3);
		for(String item:si.keySet())
			System.out.println(item + " : " + si.get(item));
		System.out.println();
		Set<String> ss = new TreeSet<String>(si.keySet());
		Map<String,Integer> sil = new LinkedHashMap<String,Integer>();
		
		Iterator<String> is = si.keySet().iterator();
		while(is.hasNext()){
			String t = is.next();
			sil.put(t, si.get(t));
		}
		for(String item:sil.keySet())
			System.out.println(item + " : " + sil.get(item));
	}
}
