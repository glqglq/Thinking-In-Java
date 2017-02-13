package ch08.Exercises;
/**
 * Exercise-8.2¡¢3¡¢4
 */
import java.util.Random;

class Shape {
	public void draw(){}
	public void erase(){}
	public void func(){System.out.println("func() in Class Shape");}
}

class Circle extends Shape{
	@Override public void draw(){System.out.println("Circle.draw()");}
	@Override public void erase(){System.out.println("Circle.erase()");}
	@Override public void func(){System.out.println("func() in Class Circle");}
}
class Square extends Shape{
	@Override public void draw(){System.out.println("Square.draw()");}
	@Override public void erase(){System.out.println("Square.erase()");}
}
class Triangle extends Shape{
	@Override public void draw(){System.out.println("Triangle.draw()");}
	@Override public void erase(){System.out.println("Triangle.erase()");}
}
class RandomShapeGenerator{
	private Random rand = new Random(47);
	public Shape next(){
		switch(rand.nextInt(3)){
			case 0:return new Circle();
			case 1:return new Square();
			case 2:return new Triangle();
		}
		return null;
	}
}
public class Shapes{
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		for(int i = 0;i < s.length;i++)
			s[i] = gen.next();
		for(Shape shp:s){
			shp.draw();
			shp.func();			
		}
	}
}