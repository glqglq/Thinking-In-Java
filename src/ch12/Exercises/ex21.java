package ch12.Exercises;
/**
 * Exercise-12.21
 * @author LuckyGong
 *
 */

class Base{
	String s;
	Base(String s) throws RuntimeException{this.s = s + "Base";throw new RuntimeException("Base");}
}
class Son extends Base{
	Son(String s) throws RuntimeException{
//		´íÎó£º
//		try{
//			super(s);
//		}catch(RuntimeException e){
//			e.printStackTrace(System.out);
//		}
		super(s);
	}
}
public class ex21 {
	public static void main(String[] args) {
		try{
			Son s = new Son("haha");
		}catch(RuntimeException e){
			e.printStackTrace(System.out);
		}
	}
}
