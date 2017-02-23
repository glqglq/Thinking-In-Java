package ch12.Exercises;
/**
 * Exercise-12.2
 * @author LuckyGong
 *
 */
public class ex2 {
	static String func(Integer s){return s.toString();}
	public static void main(String[] args) {
		Integer s = null;
		try{
			func(s);
		}catch(NullPointerException e){
			System.out.println("“Ï≥£");
		}
	}
}
