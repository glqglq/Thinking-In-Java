package ch05.Exercises;
/**
 * Exercise-5.8
 * @author LuckyGong
 *没想明白有什么意思
 */
class TTT{
	void func1(){
		func2();
		this.func2();
	}
	void func2(){System.out.println("func2");}
}
public class This {
	public static void main(String[] args) {
		TTT t = new TTT();
		t.func1();
	}
}
