package ch12.Exercises;
/**
 * Exercise-12.8
 * @author LuckyGong
 *
 */

public class ex8{
	static void func() throws MyException{
		throw new MyException();
	}
	public static void main(String[] args) {
		try{
			func();
		}catch(MyException e){
			e.printStackTrace();
		}
	}
}
