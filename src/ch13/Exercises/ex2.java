package ch13.Exercises;

import java.io.PrintStream;
import java.util.Formatter;

class Turtle{
	private String name;
	private Formatter f;
	
	public Turtle(String name,Formatter f) {
		this.name = name;
		this.f = f;
	}
	
	public void move(int x,int y){f.format("%s The Turtle is at (%d,%d)\n", name,x,y);}
}
public class ex2 {
	public static void main(String[] args) {
		PrintStream outAlias = System.err;
		Turtle tommy = new Turtle("Tommt",new Formatter(System.err));
		Turtle jerry = new Turtle("Terry",new Formatter(outAlias));
		tommy.move(0, 1);
		jerry.move(2,5);
	}
}
