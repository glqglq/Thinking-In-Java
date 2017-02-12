package ch07.Exercises;
/**
 * Exercise-7.12
 * @author LuckyGong
 *
 */
class Component11{
	Component11(int i){System.out.println("Constructor Component1(" + i + ")");}
	void dispose() { System.out.println("Component11.dispose()"); }
}
class Component22{
	Component22(double i){System.out.println("Constructor Component2(" + i +")");}
	void dispose() { System.out.println("Component22.dispose()"); }
}
class Component33{
	Component33(String s){System.out.println("Constructor Component3(" + s + ")");}
	void dispose() { System.out.println("Component33.dispose()"); }
}
class Root2{
	Component11 c1;
	Component22 c2;
	Component33 c3;
	Root2(int i,double j,String s){
		Component11 c1 = new Component11(i);
		Component22 c2 = new Component22(j);
		Component33 c3 = new Component33(s);
	}
	void dispose() {
		c1.dispose();
		c2.dispose();
		c3.dispose();
		System.out.println("Root2.dispose()"); 
	}
}
public class Stem2 extends Root2{
	Stem2(int i, double d, String s) {
		super(i, d, s);
	}
	void dispose(){
		super.dispose();
		System.out.println("Stem2.dispose()");
	}
	public static void main(String[] args) {
		Stem2 s = new Stem2(1,1.5,"String");
	}
}
