package ch13.Exercises;

import java.util.Formatter;

public class ex6 {
	int a;
	long b;
	float c;
	double d;
	
	ex6(int a,long b,float c,double d){this.a = a;this.b = b;this.c = c;this.d = d;}
	
	@Override
	public String toString() {
		return String.format("%d %d %f %f", a,b,c,d);
	}
	public static void main(String[] args) {
		ex6 e = new ex6(11,11111111111L,1.5000f,66.25);
		System.out.println(e);
	}
}
