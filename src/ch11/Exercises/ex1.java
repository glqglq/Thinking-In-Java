package ch11.Exercises;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Exercise-11.1¡¢8
 * @author LuckyGong
 *
 */
class Gerbil{
	int gerbilNumber;
	Gerbil(int gerbilNumber){this.gerbilNumber = gerbilNumber;}
	
	public void hop(){System.out.println("Hop gerbil " + gerbilNumber);}
}

public class ex1 {
	public static void main(String[] args) {
		ArrayList<Gerbil> gs = new ArrayList<Gerbil>();
		for(int i = 0;i < 10;i++)
			gs.add(new Gerbil(i));
		for(Gerbil g:gs)
			g.hop();
		Iterator<Gerbil> it = gs.iterator();
		while(it.hasNext())
			it.next().hop();
	}
}
