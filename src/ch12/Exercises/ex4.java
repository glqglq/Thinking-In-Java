package ch12.Exercises;
/**
 * Exercise-12.4
 * @author LuckyGong
 *
 */
class MyException extends Exception{
	String s;
	public MyException(){}
	public MyException(String s){
		super(s);
		this.s = s;
	}
}
public class ex4 {
	public static void main(String[] args) {
		try{
			throw new MyException("sa");
		}catch(MyException e){
			System.out.println(e.s);
			throw new RuntimeException(e);
		}
	}
}
