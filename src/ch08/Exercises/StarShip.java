package ch08.Exercises;
/**
 * Exercise-8.16
 */
class AlterStatus{
	
}
class StatusOne extends AlterStatus{
	public String toString(){return "StatusOne!";}
}
class StatusTwo extends AlterStatus{
	public String toString(){return "StatusTwo!";}
}
class StatusThree extends AlterStatus{
	public String toString(){return "StatusThree!";}
}
public class StarShip {
	public static void main(String[] args) {
		AlterStatus a = new StatusOne();
		System.out.println(a);
		a = new StatusTwo();
		System.out.println(a);
		a = new StatusThree();
		System.out.println(a);
	}
}
