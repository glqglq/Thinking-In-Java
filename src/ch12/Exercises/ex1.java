package ch12.Exercises;
/**
 * Exercise-12.1
 * @author LuckyGong
 *
 */
public class ex1 {
	public static void main(String[] args){
		try{
			System.out.println("try");
			throw new Exception();
		}catch(Exception e){
			e.printStackTrace(System.out);
		}finally{
			System.out.println("finally");
		}
	}
}
