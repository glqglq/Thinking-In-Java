package ch13.Exercises;

import java.util.Scanner;

class MyClass{
	int i;
	long l;
	float f;
	double d;
	String s;
	public MyClass(String ss) {
		Scanner stdin = new Scanner(ss);
		this.i = stdin.nextInt();
		this.l = stdin.nextLong();
		this.f = stdin.nextFloat();
		this.d = stdin.nextDouble();
		this.s = stdin.next();
	}
	@Override
	public String toString() {
		return "" + i + " " + l + " " + f + " " + d + " " + s;
	}
}
public class ex20 {
	public static void main(String[] args) {
		MyClass m = new MyClass("17 56789 2.7 3.61412 hello");
		System.out.println(m);
	}
}
