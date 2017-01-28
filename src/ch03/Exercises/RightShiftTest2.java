package ch03.Exercises;
/*
 * Exercise-3.11
 */
public class RightShiftTest2 {
	public static void main(String[] args) {
		int num = 0x10000000;
		for(int i = 1;i < 30;i++){
			System.out.println(Integer.toBinaryString(num>>i));
		}
	}
}
