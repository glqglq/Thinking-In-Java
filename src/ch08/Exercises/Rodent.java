package ch08.Exercises;
/**
 * Exercise-8.9¡¢12
 * @author LuckyGong
 *
 */
public class Rodent  {
	@Override public String toString() {return "Rodent";}
	protected void dispose() {
		System.out.println("Rodent.dispose()");
	}
	public static void main(String[] args) {
		Rodent[] a = {
				new Mouse(),
				new Gerbil(),
				new Hamster()
		};
		for(int i = 0;i < a.length;i++)
			a[i].dispose();
		
	}
}
class Mouse extends Rodent{
	@Override public String toString() {return "Mouse";}
	protected void dispose() {
		super.dispose();
		System.out.println("Mouse.dispose()");
	}
}
class Gerbil extends Rodent{
	@Override public String toString() {return "Gerbil";}
	protected void dispose() {
		super.dispose();
		System.out.println("Gerbil.dispose()");
	}
}
class Hamster extends Gerbil{
	@Override public String toString() {return "Hamster";}
	protected void dispose() {
		super.dispose();
		System.out.println("Hamster.dispose()");
	}
}