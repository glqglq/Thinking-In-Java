package ch02.Exercises;
/*Exercise-2.4 & 2.5
 * */
public class DataOnly {
	int i;
	double d;
	boolean b;
	private void show(){
		System.out.println(i);
		System.out.println(b);
		System.out.println(d);
	}
	public static void main(String[] args) {
		DataOnly DO = new DataOnly();
		DO.i = 47;
		DO.b = false;
		DO.d = 1.1;
		DO.show();
	}
}
