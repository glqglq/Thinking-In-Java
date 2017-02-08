package ch05.Exercises;
/**
 * Exercise-5.10��11
 * @author LuckyGong
 *
 */

class WebBank {
	boolean loggedIn = false;
	WebBank(boolean logStatus) {
		loggedIn = logStatus;
	}
	void logIn() {
		loggedIn = true;
	}
	void logOut() {
		loggedIn = false;
	}
	protected void finalize() {
		if(loggedIn)
			System.out.println("Error: still logged in");
		// Normally, you'll also do this:
		// super.finalize(); // Call the base-class version
	}
}

public class TerminationConditionEx {
	public static void main(String[] args) {
		WebBank bank1 = new WebBank(true);
		WebBank bank2 = new WebBank(true);
		new WebBank(true);
		// Proper cleanup: log out of bank1 before going home:
		bank1.logOut();
		// Forget to logout of bank2 and unnamed new bank
		// Attempts to finalize any missed banks:
		System.out.println("Try 1: "); 
		System.runFinalization();
		System.out.println("Try 2: "); 	
		Runtime.getRuntime().runFinalization();
		System.out.println("Try 3: "); 
		System.gc();
		System.out.println("Try 4: ");
		// using deprecated since 1.1 method:
		System.runFinalizersOnExit(true);		
	}	
}