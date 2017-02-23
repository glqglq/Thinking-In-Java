package ch12.Exercises;
/**
 * Exercise-12.5
 * @author LuckyGong
 *
 */
public class ex5 {
	static int i = 0;
	public static void main(String[] args) {
		while(true){
			try{
				if(i <= 5)  throw new Exception();
				break;
			}catch(Exception e){
				System.out.println(i++);
			}
		}
	}
}
