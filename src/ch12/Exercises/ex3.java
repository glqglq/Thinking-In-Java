package ch12.Exercises;

import java.io.*;
import java.util.logging.Logger;

/**
 * Exercise-12.3、27
 * @author LuckyGong
 *
 */
class MyException3 extends Exception{
	private static Logger logger = Logger.getLogger("Logger");
	MyException3(Exception e){
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		logger.severe(sw.toString());
	}
}
public class ex3 {
	public static void main(String[] args) {
		try{
			int[] a = {1,2,3};
			System.out.println(a[55]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组越界");
			new MyException3(e);
			//new RuntimeException(e);//ex-12.27
		}
	}
}
