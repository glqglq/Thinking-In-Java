package ch05.Exercises;
/**
 * Exercise-5.19
 * @author LuckyGong
 *
 */
public class Vararg {
	static void p(String... args){
		for(String p:args){
			System.out.println(p);
		}
	}
	public static void main(String[] args) {
		p("wo","shi","ni","ba","ba");
	}
}
