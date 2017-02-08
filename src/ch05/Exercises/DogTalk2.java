package ch05.Exercises;
/**
 * Exercise-5.6
 * @author LuckyGong
 *
 */
class Dog2{
	void bark(String s,int i){
		System.out.println("1");
	}
	void bark(int i,String s){
		System.out.println("2");
	}
}
public class DogTalk2 {
	public static void main(String[] args) {
		Dog2 d = new Dog2();
		d.bark(1, "1");
		d.bark("2", 2);
	}
}
