package ch09.Exercises;
interface Cycle{}
interface CycleFactory{Cycle getCycle();}
class Unicycle implements Cycle{}
class Bicycle implements Cycle{}
class Tricycle implements Cycle{}
class UnicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Unicycle();
	}
}
class BicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Bicycle();
	}
}
class TricycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Tricycle();
	}
}
public class CycleFactoryTest {
	public static void rideCycle(CycleFactory c) {
		Cycle t = c.getCycle();
	}
	public static void main(String[] args) {
		rideCycle(new UnicycleFactory());
		
	}
}
