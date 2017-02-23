package ch12.Exercises;

import java.io.*;
import java.util.logging.Logger;

/**
 * Exercise-12.6
 * @author LuckyGong
 *
 */
class MyException2 extends Exception{
	private static Logger logger = Logger.getLogger("Default");
	MyException2(){
		StringWriter sw = new StringWriter();
		printStackTrace(new PrintWriter(sw));
		logger.severe(sw.toString());
	}
}

public class ex6 {
	public static void main(String[] args) {
		try{
			throw new MyException2();
		}catch(MyException2 e){
			System.err.println("Caught" + e);
		}
	}
}
