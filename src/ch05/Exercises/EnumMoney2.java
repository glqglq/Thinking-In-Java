package ch05.Exercises;
/**
 * Exercise-5.22
 */

import ch05.Exercises.EnumMoney.money;

public class EnumMoney2 {
	money b;
	public static void main(String[] args) {
		for(money b : money.values()) {
			System.out.print("Worth: ");
			switch(b) {
				case ONE: System.out.println("$1"); break; 
				case FIVE: System.out.println("$5"); break;
				case TEN: System.out.println("$10"); break;
				case TWENTY: System.out.println("$20"); break; 
				case FIFTY: System.out.println("$50"); break;
				case HUNDRED: System.out.println("$100"); break;
				default: break;
			}
		}	
	}
}