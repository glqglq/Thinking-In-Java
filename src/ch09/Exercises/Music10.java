// interfaces/music10/Music10.java
// TIJ4 Chapter Interfaces, Exercise 10, page 320
/* Modify Music5.java by adding a Playable interface. Move the play() declaration
* from Instrument to Playable. Add Playable to the derived classes by including
* it in the implements list. Change tune() so that it takes a Playable instead
* of and Instrument.
*/
package ch09.Exercises;

interface Instrument {
	// Compile-time constant:
	int VALUE = 5; // static and final
	// Cannot have method definitions:	
	void adjust(); 
}

interface Playable {
	void play(); // Automatically public
}

class Wind10 implements Instrument, Playable {
	public void play() {
		System.out.println(this + ".play() ");
	}
	public String toString() { return "Wind"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}


class Percussion10 implements Instrument, Playable {
	public void play() {
		System.out.println(this + ".play() ");
	}
	public String toString() { return "Percussion"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}

class Stringed10 implements Instrument, Playable {
	public void play() {
		System.out.println(this + ".play() ");
	}
	public String toString() { return "Stringed"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}

class Brass extends Wind10 {
	public String toString() { return "Brass"; }
}

class Woodwind extends Wind10 {
	public String toString() { return "Woodwing"; }
}

public class Music10 {
	// Doesn't care about type, so new types
	// added to the system will work right:
	static void tune(Playable p) {
		//...
		p.play();
	}
	static void tuneAll(Playable[] e) {
		for(Playable p : e)
			tune(p);
	}
	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Playable[] orchestra = {
			new Wind10(),
			new Percussion10(),
			new Stringed10(),
			new Brass(),
			new Woodwind()
		};
		tuneAll(orchestra);
	}
}