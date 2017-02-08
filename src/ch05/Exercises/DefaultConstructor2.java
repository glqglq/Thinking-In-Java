package ch05.Exercises;
/**
 * Exercise-5.4
 * @author LuckyGong
 *
 */
class Constructor2{
	Constructor2(){
		System.out.println("Constructor!!!");
	}
	Constructor2(String s){
		System.out.println("Constructor2  " + s);
	}
}
public class DefaultConstructor2 {
	public static void main(String[] args) {
		Constructor2 c = new Constructor2();
		Constructor2 c2 = new Constructor2("hehe");
	}
}
