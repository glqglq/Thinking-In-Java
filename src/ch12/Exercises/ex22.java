package ch12.Exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Exercise-12.22¡¢24
 * @author LuckyGong
 *
 */
class FailingConstructor{
	private BufferedReader in;
	
	FailingConstructor(String fname){
		try {
			in = new BufferedReader(new FileReader(fname));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e){
			try {
				in.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void dispose(){
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("in.close() failed");
		}
	}
}
public class ex22 {
	public static void main(String[] args) {
		FailingConstructor f = new FailingConstructor("123");
	}
}
