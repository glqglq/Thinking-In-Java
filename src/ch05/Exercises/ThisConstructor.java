package ch05.Exercises;
/**
 * Exercise-5.9
 * @author LuckyGong
 *
 */
class TTTT{
	TTTT(){
		this("my");//注意：构造器调用是这么调用的！！！
	}
	TTTT(String s){
		System.out.println(s);
	}
}
public class ThisConstructor {
	public static void main(String[] args) {
		new TTTT();
	}
}
