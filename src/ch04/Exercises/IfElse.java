/*
 * Exercise-4.2¡¢3
 */
package ch04.Exercises;

import java.util.Random;

public class IfElse {
	public static void main(String[] args) {
		Random ran = new Random();
		int last = ran.nextInt();
		for(int i = 1;i < 25;i++){
			int now = ran.nextInt();
			if(last > now)
				System.out.println(last + ">" + now);
			else if(last == now)
				System.out.println(last + "=" + now);
			else if(last < now)
				System.out.println(last + "<" + now);
			last = now;
		}
		while(true){
			int now = ran.nextInt();
			if(last > now)
				System.out.println(last + ">" + now);
			else if(last == now)
				System.out.println(last + "=" + now);
			else if(last < now)
				System.out.println(last + "<" + now);
			last = now;
		}
	}
}
