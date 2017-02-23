package ch12.Exercises;
/**
 * Exercise-12.9
 * @author LuckyGong
 *
 */
class MyException4 extends Exception{
	
}
class MyException5 extends Exception{
	
}
class MyException6 extends Exception{
	
}
public class ex9 {
	public static void main(String[] args) {
		try{
			throw new MyException4();
		}catch(Exception e){
			e.printStackTrace(System.out);
		}
		try{
			throw new MyException5();
		}catch(Exception e){
			e.printStackTrace(System.out);
		}
		try{
			throw new MyException6();
		}catch(Exception e){
			e.printStackTrace(System.out);
			throw new NullPointerException();
		}finally{
			System.out.println("finally");
		}
	}
}
