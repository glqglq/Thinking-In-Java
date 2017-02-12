package ch06.Exercises;
class ConnectionManager{
	private int[] Connection = null;
	static void CreateConnection(ConnectionManager m){
		m.Connection = new int[]{1,2,3,4,5,6};
	}
	int[] getter(){
		return Connection;
	}
}
public class ClassConnectionManager {
	public static void main(String[] args) {
		ConnectionManager c = new ConnectionManager();
		System.out.println(c.getter());
		c.CreateConnection(c);
		System.out.println(c.getter());
		
	}
}
