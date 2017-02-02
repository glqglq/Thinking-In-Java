/*
 * Exercise-4.4
 */
package ch04.Exercises;

public class Primes {
	public static void main(String[] args) {
		for(int i = 0;i < 1000;i++){
			int flag = 1;
			for(int j = 2;j < i;j++){				
				if(i % j == 0) flag = 0;
			}
			if(flag == 1) System.out.println(i);
		}
	}
}
