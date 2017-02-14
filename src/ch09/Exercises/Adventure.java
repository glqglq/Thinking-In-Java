package ch09.Exercises;
/**
 * Exercise-9.12
 * @author LuckyGong
 *
 */

interface CanFight{
	void fight();
}
interface CanSwim{
	void swim();
}
interface CanFly{
	void fly();
}
interface CanClimb{
	void climb();
}
class ActionCharacter{
	public void fight(){}
}
class Hero extends ActionCharacter implements CanFly,CanSwim,CanFight{
	public void swim(){}
	public void fly(){}
}
public class Adventure {
	public static void t(CanFight x){x.fight();}
	public static void u(CanSwim x){x.swim();}
	public static void v(CanFly x){x.fly();}
	public static void w(ActionCharacter x){x.fight();}
	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
	}
}
