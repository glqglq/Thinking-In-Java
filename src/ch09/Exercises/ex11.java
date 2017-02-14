package ch09.Exercises;

/**
 * Exercise-9.11
 */
interface Processor{
	public String name();
	Object process(Object input);
}
class Apply{
	public static void process(Processor p,Object s){
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(s));
	}
}
class StringAdapter implements Processor{
	String now;
	StringAdapter(String now){this.now = now;}
	public String name(){return getClass().getSimpleName();}
	public Object process(Object input){
		return input.toString() + " OK";
	}
}
public class ex11 {
	public static void main(String[] args) {
		String s = "gong";
		Apply.process(new StringAdapter(new String()), s);
	}
}