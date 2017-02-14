package ch09.Exercises;

/**
 * Exercise-9.1
 * @author LuckyGong
 *
 */
public abstract class Rodent  {
	abstract public String toString();
	abstract protected void dispose();
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
		System.out.println("Mouse.dispose()");
	}
}
class Gerbil extends Rodent{
	@Override public String toString() {return "Gerbil";}
	protected void dispose() {
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