package ch07.Exercises;
/**
 * Exercise-7.9¡¢7.10
 * @author LuckyGong
 *
 */
class Component1{
	Component1(int i){System.out.println("Constructor Component1(" + i + ")");}
}
class Component2{
	Component2(double i){System.out.println("Constructor Component2(" + i +")");}
}
class Component3{
	Component3(String s){System.out.println("Constructor Component3(" + s + ")");}
}
class Root{
	Component1 c1;
	Component2 c2;
	Component3 c3;
	Root(int i,double j,String s){
		Component1 c1 = new Component1(i);
		Component2 c2 = new Component2(j);
		Component3 c3 = new Component3(s);
	}
}
public class Stem extends Root{
	Stem(int i, double d, String s) {
		super(i, d, s);
	}

	public static void main(String[] args) {
		Stem s = new Stem(1,1.5,"String");
	}
}
