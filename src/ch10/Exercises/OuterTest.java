package ch10.Exercises;

class Outer2 {
	Outer2(){System.out.println("Outer2()");}
	class Inner2{
		Inner2(){System.out.println("Inner2()");}
	}
}
public class OuterTest{
	Outer2 o  = new Outer2();
	Outer2.Inner2 i = o.new Inner2();
}