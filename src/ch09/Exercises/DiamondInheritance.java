package ch09.Exercises;
/**
 * Exercise-9.13
 * @author LuckyGong
 *
 */
interface Interface1{
	void DoOne();
}
interface Interface2 extends Interface1{
	void DoTwo();
}
interface Interface3 extends Interface1{
	void DoThree();
}
interface Interface4 extends Interface2,Interface3{
	void DoFour();
}
public class DiamondInheritance implements Interface4{
	public void DoOne(){}
	public void DoTwo(){}
	public void DoThree(){}
	public void DoFour(){}
	public static void main(String[] args) {
		DiamondInheritance d = new DiamondInheritance();
		((Interface4)d).DoFour();
		((Interface3)d).DoThree();
		((Interface2)d).DoTwo();
		((Interface1)d).DoOne();
	}
}
