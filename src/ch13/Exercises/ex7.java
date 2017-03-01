package ch13.Exercises;

public class ex7 {
	String Input;
	public ex7(String Input) {
		this.Input = Input;
	}
	public static void main(String[] args) {
		ex7 e = new ex7("SSS2222ccc.");
		if(e.Input.matches("^[A-Z].*[\\.]$")) System.out.println("Yes!");
		else System.out.println("No!");
		ex7 e2 = new ex7("sSS2222ccc.");
		if(e2.Input.matches("^[A-Z].*[\\.]$")) System.out.println("Yes!");
		else System.out.println("No!");
	}
}
