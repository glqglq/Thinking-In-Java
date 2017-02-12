package ch07.Exercises;
class Base{
	Base(int i){System.out.println("Constructor Base(" + i + ")");}
}
public class Ex8 extends Base{
	Ex8(int i){
		super(i);
	}
	Ex8(){
		super(1);
		System.out.println("Constructor Ex8()");
	}
	public static void main(String[] args) {
		Ex8 e1 = new Ex8();
		Ex8 e2 = new Ex8(1);
	}
}
