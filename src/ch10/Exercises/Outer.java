package ch10.Exercises;
/**
 * Exercise-10.1¡¢3
 * @author LuckyGong
 *
 */
public class Outer {
	private String s;
	
	Outer(String s){this.s = s;System.out.println("Outer(" + s + ")");}
	
	public class Inner{
		Inner(){System.out.println("Inner");}
		@Override
		public String toString() {return s;}
	}
	public Inner func(){
		return new Inner();
	}
	public static void main(String[] args) {
		Outer o = new Outer("s");
		Inner i = o.func();
		System.out.println(i);
	}
}
