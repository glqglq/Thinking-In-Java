package ch08.Exercises;

import java.util.Random;

/**
 * Exercise-8.6-8
 * @author LuckyGong
 *
 */
class Instrument{
	void play(){System.out.println("Instrument.play()");}
	public String toString(){return "Instrument";}
	void adjust(){System.out.println("Adjusting Instrument");}
}
class Wind extends Instrument{
	void play(){System.out.println("Wind.play()");}
	public String toString(){return "Wind";}
	void adjust(){System.out.println("Adjusting Wind");}
}
class Percussion extends Instrument{
	void play(){System.out.println("Percussion.play()");}
	public String toString(){return "Percussion";}
	void adjust(){System.out.println("Adjusting Percussion");}
}
class Stringed extends Instrument{
	void play(){System.out.println("Stringed.play()");}
	public String toString(){return "Stringed";}
	void adjust(){System.out.println("Adjusting Stringed");}
}
class Keyboard extends Instrument {
	void play() { System.out.println("Keyboard.play() "); }
	public String toString() { return "Keyboard"; }
	void adjust() { System.out.println("Adjusting Keyboard"); } 
}
class Brass extends Wind{
	void play(){System.out.println("Brass.play()");}
	public String toString() { return "Brass"; }
	void adjust(){System.out.println("Adjusting Brass");}
}
class Woodwind extends Wind{
	void play(){System.out.println("Woodwind.play()");}
	public String toString() { return "Woodwind"; }
	void adjust(){System.out.println("Adjusting Woodwind");}
}
public class Music {
	public static void tune(Instrument i){
		i.play();
	}
	public static void tuneAll(Instrument[] e){
		for(Instrument i:e)
			tune(i);
	}
	public static void main(String[] args) {
		
//		Instrument[] orchetra = {
//				new Wind(),
//				new Percussion(),
//				new Stringed(),
//				new Brass(),
//				new Woodwind()
//		};
		Instrument[] orchetra = new Instrument[5];
		Random r = new Random(47);
		for(int i = 0;i < 5;i++){
			switch(r.nextInt(5)){
				case 0:orchetra[i] = new Wind();break;
				case 1:orchetra[i] = new Percussion();break;
				case 2:orchetra[i] = new Stringed();break;
				case 3:orchetra[i] = new Brass();break;
				case 4:orchetra[i] = new Woodwind();break;
			}
		}
		tuneAll(orchetra);
		for(Instrument i:orchetra)
			System.out.println(i);
	}
}
