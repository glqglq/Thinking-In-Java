package ch08.Exercises;
/**
 * Exercise-8.1¡¢17
 * @author LuckyGong
 *
 */
class Cycle{
	int i;
	int wheels(){return 0;}
}
class Unicycle extends Cycle{
	Unicycle(){i = 1;}
	@Override int wheels(){return 1;}
	public void balance() {System.out.println("Unicycle.balance()");}
}
class Bicycle extends Cycle{
	Bicycle(){i = 2;}
	@Override int wheels(){return 2;}
	public void balance() {System.out.println("Bicycle.balance()");}
}
class Tricycle extends Cycle{
	Tricycle(){i = 3;}
	@Override int wheels(){return 3;}
}
public class CycleClass {
	private static void ride(Cycle c) {
		System.out.println(c.wheels());
	}
	public static void main(String[] args) {
		Unicycle c1 = new Unicycle();
		Bicycle c2 = new Bicycle();
		Tricycle c3 = new Tricycle();
		ride(c1);
		ride(c2);
		ride(c3);
		Cycle[] c = {new Unicycle(),new Bicycle(),new Tricycle()};
		// Compile time error: cannot find balance() method in Cycle:
		// for(Cycle c : ride) {
		//	c.balance();
		// }
		((Unicycle)c[0]).balance();
		((Bicycle)c[1]).balance();
		// Compile time error: no balance() in Tricycle:
		// ((Tricycle)ride[2]).balance();
		// RTTI: ClassCastException: Tricycle cannot be cast to Bicycle:
		// ((Bicycle)ride[2]).balance();
	}
}
