package ch09.Exercises;

/**
 * Exercise-9.7
 * @author LuckyGong
 *
 */
interface Rodent7 {
	int now = 1;
	String toString();
	void dispose();
}
class Mouse7 implements Rodent7{
	@Override public String toString() {return "Mouse";}
	public void dispose() {
		System.out.println("Mouse.dispose()");
	}
}
class Gerbil7 implements Rodent7{
	@Override public String toString() {return "Gerbil";}
	public void dispose() {
		System.out.println("Gerbil.dispose()");
	}
}
class Hamster7 extends Gerbil7{
	@Override public String toString() {return "Hamster";}
	public void dispose() {
		super.dispose();
		System.out.println("Hamster.dispose()");
	}
}
public class RodentTest{
	public static void main(String[] args) {
		Rodent7[] a = {
				new Mouse7(),
				new Gerbil7(),
				new Hamster7()
		};
		for(int i = 0;i < a.length;i++)
			a[i].dispose();
		
	}
}