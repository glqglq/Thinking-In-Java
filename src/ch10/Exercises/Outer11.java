package ch10.Exercises;

import ch10.Exercises.InnerAndOuter.Interface11;

/**
 * Exercise-10.11
 * @author LuckyGong
 *
 */
class InnerAndOuter{
	public interface Interface11{
		Interface11 func();
	}
	private class Implement11 implements Interface11{
		public Interface11 func(){
			return new Implement11();
		}
	}	
	static Interface11 func(){
		InnerAndOuter io = new InnerAndOuter();
		return io.new Implement11();
	}
}
public class Outer11 {
	public static void main(String[] args) {
		Interface11 inter = InnerAndOuter.func();
		//(Implement11)inter;
	}
}
