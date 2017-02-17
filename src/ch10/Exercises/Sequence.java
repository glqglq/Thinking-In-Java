package ch10.Exercises;
/**
 * Exercise-10.2¡¢4¡¢22
 * @author LuckyGong
 *
 */
interface Selector{
	boolean end();
	Object current();
	void next();
}
class MyString{
	String s;
	MyString(int s){this.s = Integer.toString(s);}
	@Override
	public String toString() {return s;}
}
public class Sequence {
	private Object[] items;
	private int next = 0;
	
	public Sequence(int size){items = new Object[size];}
	
	public void add(Object x){if(next < items.length) items[next++] = x;}
	private class SequenceSelector implements Selector{
		private int i  = 0;
		public boolean end(){return i == items.length;}
		public Object current(){return items[i];}
		public void next(){if(i < items.length) i++;}
		public Sequence func(){return Sequence.this;}
	}
	
	private class SequencereverseSelector implements Selector{
		private int i  = items.length;
		public boolean end(){return i == 0;}
		public Object current(){return items[i];}
		public void next(){if(i >= 0) i--;}
		public Sequence func(){return Sequence.this;}
	}
	
	public Selector selector(){return new SequenceSelector();}
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for(int i = 0;i < 10;i++){
			sequence.add(new MyString(i));
		}
		Selector selector = sequence.selector();
		while(!selector.end()){
			System.out.println(selector.current() + " ");
			selector.next();
		}
	}
}
