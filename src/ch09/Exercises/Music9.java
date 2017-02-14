// interfaces/music9/Music9.java
// TIJ4 Chapter Interfaces, Exercise 9, page 320
/* Refactor Music5.java by moving the common methods in Wind, Percussion and
* Stringed into an abstract class.
*/
package ch09.Exercises;

abstract class Instrument9 {
	private int i; 
	public abstract void play();
	public String toString() { return "Instrument"; } 
	public abstract void adjust(); 
}

class Wind9 extends Instrument9 implements Instrument {
	public void play() {
		System.out.println(this + ".play() ");
	}
	public String toString() { return "Wind"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}

class Percussion9 extends Instrument9 implements Instrument {
	public void play() {
		System.out.println(this + ".play() ");
	}
	public String toString() { return "Percussion"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}

class Stringed9 extends Instrument9 implements Instrument {
	public void play() {
		System.out.println(this + ".play() ");
	}
	public String toString() { return "Stringed"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}

class Brass9 extends Wind9 {
	public String toString() { return "Brass"; }
}

class Woodwind9 extends Wind9 {
	public String toString() { return "Woodwing"; }
}

public class Music9 {
	// Doesn't care about type, so new types
	// added to the system will work right:
	static void tune(Instrument i) {
		//...
		((Instrument9) i).play();
	}
	static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument[] orchestra = {
			new Wind9(),
			new Percussion9(),
			new Stringed9(),
			new Brass9(),
			new Woodwind9()
		};
		tuneAll(orchestra);
	}
}