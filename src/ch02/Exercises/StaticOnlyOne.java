package ch02.Exercises;
/*Exercise-2.8
 * */
public class StaticOnlyOne {
	static int i;
	public static void main(String[] args) {
		StaticOnlyOne s1 = new StaticOnlyOne();
		System.out.println(s1.i);
		s1.i++;
		StaticOnlyOne s2 = new StaticOnlyOne();
		System.out.println(s1.i);
		s2.i++;
		StaticOnlyOne s3 = new StaticOnlyOne();
		System.out.println(s3.i);
		s3.i++;
		StaticOnlyOne s4 = new StaticOnlyOne();
		System.out.println(s4.i);
		s4.i++;
				
	}
}
