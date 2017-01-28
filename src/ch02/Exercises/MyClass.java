package ch02.Exercises;
/*Exercise-2.1
 * 
 * */
public class MyClass {
	int num;
	char ch;
	public static void main(String[] args) {
		MyClass my = new MyClass();//这里可以在自己的类中new自己，也可以用static
		System.out.println(my.num+my.ch);
	}
}
