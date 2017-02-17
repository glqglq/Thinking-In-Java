package ch10.Exercises;
/**
 * Exercise-10.23
 * @author LuckyGong
 *
 */
interface U{
	int now = 0;
	void func1();
	void func2();
	String toString();
}
class A{
	U func4(){
		return new U(){
			public void func1(){}
			public void func2(){}
			public String toString(){return Integer.toString(now);}
		};
	}
}
class B{
	U[] u;
	int sum = 0;
	B(int s){sum = s;}
	void save(U uu,int i){u[i] = uu;}
	void setNull(int i){u[i] = null;}
	void show(){
		for(int i = 0;i < u.length;i++) System.out.println(u[i]);
	}
}
public class UTest {
	public static void main(String[] args) {
		A[] a = {new A(),new A(),new A(),new A()};
		B b = new B(3);
		for(int i = 0;i < a.length;i++)
			b.save(a[i].func4(),i);
		b.show();
	}
}
