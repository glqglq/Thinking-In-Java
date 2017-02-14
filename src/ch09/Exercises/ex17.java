package ch09.Exercises;
interface Days{
	int MONDAY = 1,TUESDAY = 2,WEDNESDAY = 3,THURSDAY = 4,FRIDAY = 5,SATURDAY = 6,SUNDAY = 7;
}
class Week implements Days{
	private static int count = 0;
	private int id = count++;
	public Week() { System.out.println("Week() " + id); }
}
public class ex17 {
	public static void main(String[] args) {
		// Without any objects, static fields exist:
		System.out.println("SUNDAY = " + Days.SUNDAY);
		System.out.println("MONDAY = " + Days.MONDAY);
		Week w0 = new Week();
		Week w1 = new Week();
		// Error: cannot assign a value to final variable SUNDAY:
		// w.SUNDAY = 2;
		// Error: cannot assign a value to final variable MONDAY: 
		// w1.MONDAY = w0.MONDAY;
	}
}
