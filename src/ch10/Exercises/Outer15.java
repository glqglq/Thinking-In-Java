package ch10.Exercises;
/**
 * Exercise-10.15
 * @author LuckyGong
 *
 */
class Base{
	protected String s;
	Base(String s){this.s = s;}
}
public class Outer15 {
	public static Base func(){
		return new Base("s"){
			{s = "k";}
			public String toString(){return s;}
		};
	}
	public static void main(String[] args) {		
		Base b = func();
		System.out.println(b);
	}
}
