package ch07.Exercises;

// reusing/BlankFinalEx.java
// TIJ4 Chapter Reusing, Exercise 19, page 266
/* Create a class with a blank final reference to an object. Perform 
* initialization at the point of definition of the field inside all 
* constructors. Demonstrate the guarantee that the final must be initialized
* before use, and that it cannot be changed once initialized.
*/

class Poppet {
	private int i;
	Poppet(int k) { i = k; }
	public String toString() { 
		return ("Poppet " + i); 
	}
}

public class BlankFinal {
	private final Poppet p; // Blank final reference
	// Blank finals MUST be initialized in the constructor:
	public BlankFinal() {
		p = new Poppet(1); // Initialize blank final reference
	}
	public BlankFinal(int x) {
		p = new Poppet(x); // Initialize blank final reference
	}
	public static void main(String[] args) {
		BlankFinal b1 = new BlankFinal();
		BlankFinal b2 = new BlankFinal(47);
		// b1.p = new Poppet(2); // Errors: cannot assign values 
 		// b2.p = new Poppet(3); // to final variables p
		System.out.println("b1.p: " + b1.p);
		System.out.println("b2.p: " + b2.p);
	}
}