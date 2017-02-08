package ch05.Exercises;
/**
 * Exercise-5.1
 * @author LuckyGong
 */
class T{
	String s;
}
public class StringIsNull {
	public static void main(String[] args) {
		T t = new T();
		System.out.println(t.s);//必须放在类中IDE才不会检查!!!否则通不过编译
	}
}
