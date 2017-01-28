package ch02.Examples;

public class ShowProperities {
	public static void main(String[] args){
		System.getProperties().list(System.out);
		System.out.println("\n\n\n\n\n\n" + System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	}
}
