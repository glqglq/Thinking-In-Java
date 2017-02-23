package ch12.Exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Exercise-12.23
 * @author LuckyGong
 *
 */
class FailingConstructor23{
	private BufferedReader in;
	
	FailingConstructor23(String fname){
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
			throw e;
		}
	}
	
	public void dispose() {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
public class ex23 {
	public static void main(String[] args) {
		try{
			FailingConstructor23 f1 = new FailingConstructor23("1");
			try{
				FailingConstructor23 f2 = new FailingConstructor23("2");
			}catch(Exception e){
				e.printStackTrace(System.out);
			}finally{
				f1.dispose();
			}
		}catch(Exception e){
			
		}
	}
}
