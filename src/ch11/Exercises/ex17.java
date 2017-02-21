package ch11.Exercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Exercise-11.17
 * @author LuckyGong
 *
 */
public class ex17 {
	public static void main(String[] args) {
		Map<String,Gerbil> gerbils = new HashMap<String, Gerbil>();
		gerbils.put("Fuzzy", new Gerbil(0));
		gerbils.put("Spot", new Gerbil(1));
		gerbils.put("Speedy", new Gerbil(2));
		gerbils.put("Dopey", new Gerbil(3));
		gerbils.put("Sleepy", new Gerbil(4));
		gerbils.put("Happy", new Gerbil(5));
		Iterator<String> im = gerbils.keySet().iterator();
		while(im.hasNext()){
			String t = im.next();
			System.out.println(t + ": ");
			gerbils.get(t).hop();
		}
	}
}
