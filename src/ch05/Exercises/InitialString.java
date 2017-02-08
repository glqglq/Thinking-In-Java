package ch05.Exercises;
/**
 * Exercise-5.2
 * @author LuckyGong
 *结论：先初始化定义时就被初始化了得域，再初始化构造器初始化的域
 */
class TT{
	String s1 = "String1";
	String s2;
	TT(){
		s2 = "String2";
	}
}
public class InitialString {
	public static void main(String[] args) {
		TT t = new TT();
		System.out.println(t.s1);
		System.out.println(t.s2);
	}
}
