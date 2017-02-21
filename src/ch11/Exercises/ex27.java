package ch11.Exercises;
/**
 * Exercise-11.27
 * @author LuckyGong
 *
 */
import java.util.*;
class Command{
	private String s;
	Command(String s){this.s = s;}
	void operation(){System.out.println(s);}
	@Override
	public String toString() {return s;	}
}
class Command2{
	static void fillQueue(Command c,Queue<Command> q){ q.offer(c);}
}
class Command3{
	static void popAll(Queue<Command> q){
		while(!q.isEmpty()){
			System.out.println("Remove: " + q.remove());
		}
	}
}
public class ex27 {
	public static void main(String[] args) {
		Queue<Command> q = new LinkedList<Command>();
		Command2.fillQueue(new Command("1"),q);
		Command2.fillQueue(new Command("2"),q);
		Command2.fillQueue(new Command("3"),q);
		Command2.fillQueue(new Command("4"),q);
		System.out.println(q);
		Command3.popAll(q);
		System.out.println(q);
	}
}
