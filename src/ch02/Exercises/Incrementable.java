package ch02.Exercises;
/*Exercise-2.7
 * */
public class Incrementable {
	static int i;
	private static void increment(){
		Incrementable.i++;
	}
	public static void main(String[] args) {
		Incrementable sf = new Incrementable();
		System.out.println(sf.i);
		sf.increment();
		System.out.println(sf.i);
	}
}