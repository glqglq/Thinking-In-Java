package ch12.Exercises;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * Exercise-12.18
 * @author LuckyGong
 *
 */
class VeryImportantException extends Exception{
	public String toString(){return "A very important exception!";}
}

class HoHumException extends Exception{
	public String toString(){return "A trival exception";}
}
class MeaninglessException extends Exception {
	public String toString() {return "A meaningless exception";}
}	
public class LostMessage {
	void f() throws VeryImportantException{
		System.out.println("f()");
		throw new VeryImportantException();
	}
	void dispose() throws HoHumException{
		System.out.println("dispose()");
		throw new HoHumException();
	}
	void eliminate() throws MeaninglessException {
		System.out.println("eliminate()");
		throw new MeaninglessException();
	}
	public static void main(String[] args) {
		try{
			LostMessage lm = new LostMessage();
			try{
				try{
					lm.f();
					lm.dispose();				
				}finally{
					lm.eliminate();
				}
			}catch(Exception e){
				System.out.println(e);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
