package ch05.Exercises;
/**
 * Exercise-5.12
 * @author LuckyGong
 *
 */
enum status{
	empty,full;
}
class Tank{
	status sta = status.full;
	protected void finalize(){
		if(sta == status.full)
			System.out.println("ц╩©удь");
	}
}
public class TankClass {
	public static void main(String[] args) {
		Tank tank1 = new Tank();
		System.out.println(tank1.sta);
		System.gc();
	}
}
