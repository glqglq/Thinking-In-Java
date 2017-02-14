package ch09.Exercises;
//interfaces/Ex15.java
//TIJ4 Chapter Interfaces, Exercise 15, page 330
/* Modify the previous exercise by creating an abstract class and 
* inheriting that into the derived class.
*/

interface History1 {
	void u();
	void v();
}

interface Exam1 {
	void w();
	void x();
}

interface Labs1 {
	void y();
	void z();
}

interface Workup1 extends History1, Exam1, Labs1 {
	void zz();
}

abstract class Doctor1 {
	private int i = 0;
	abstract void doc();
}

class Anesthesiologist1 extends Doctor1 implements Workup1 {
	private int j = 0;
	public void u() {}
	public void v() {}
	public void w() {}
	public void x() {}
	public void y() {}
	public void z() {}
	public void zz() {}
	public void doc() {} // must override abstract method in Doctor 
}

public class ex15 {
	public static void m1(History1 history) { history.v(); }
	public static void m2(Exam1 exam) { exam.w(); }
	public static void m3(Labs1 labs) { labs.y(); } 
	public static void m4(Workup1 workup) { workup.zz(); }
	public static void main(String[] args) {
		Anesthesiologist1 anes = new Anesthesiologist1();
		m1(anes);
		m2(anes);
		m3(anes);
		m4(anes);
	}
}