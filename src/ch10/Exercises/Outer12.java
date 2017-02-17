package ch10.Exercises;
/**
 * Exercise-10.12
 * @author LuckyGong
 *
 */
interface Change{
	void changefunc();
}
public class Outer12 {
	private String s;
	
	Outer12(){this.s = "0";System.out.println(s);}
	
	private void func(){System.out.println("func()");}
	public Change changefunc(){
		return new Change(){
			public void changefunc(){
				s = "1";
				System.out.println(s);
				func();
			}
		};
	}
	public static void main(String[] args) {
		Outer12 o = new Outer12();
		Change c = o.changefunc();
		c.changefunc();
	}
	
}
