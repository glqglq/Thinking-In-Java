/*
 *Exercise-3.5、6 
 */
package ch03.Exercises;
class RealDog{
	String name;
	String says;
}
public class Dog {
	public static void main(String[] args) {
		RealDog spot = new RealDog();
		RealDog scruffy = new RealDog();
		spot.says = "Ruff!";
		spot.name = "spot";
		scruffy.says = "Wurf!";
		scruffy.name = "scruffy";
		System.out.println(spot.name + " says:" + spot.says);
		System.out.println(scruffy.name + " says:"  + scruffy.says);
		RealDog t = new RealDog();
		t.says = "Ruff!";
		t.name = "spot";
		System.out.println(t.name == spot.name);
		System.out.println(t.name.equals(spot.name));
	}
}



//答案如下：
//不建议直接引用类中的域，应该以get、set方法的形式

//import org.greggordon.tools.*;
//
//class Dog {
//	String name;
//	String says;
//	void setName(String n) {
//		name = n;
//	}
//	void setSays(String s) {
//		says = s;
//	}
//	void showName() {
//		P.rintln(name);
//	}
//	void speak() {
//		P.rintln(says);
//	}
//}
//
//public class DogTest {
//	public static void main(String[] args) {
//		Dog spot = new Dog();
//		spot.setName("Spot");
//		spot.setSays("Ruff!");
//		Dog scruffy = new Dog();
//		scruffy.setName("Scruffy");
//		scruffy.setSays("Wurf!");
//		spot.showName();
//		spot.speak();
//		scruffy.showName(); 
//		scruffy.speak();
//	}
//}
