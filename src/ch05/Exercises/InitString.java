package ch05.Exercises;
/**
 * Exercise-5.17
 * @author LuckyGong
 *
 */
class InitTest {
	InitTest(String s) {
		System.out.println("InitTest()");
		System.out.println(s);
	}
}
public class InitString {
	public static void main(String[] args) {
		InitTest[] it = new InitTest[10];//��ֻ�Ǵ���ʮ�����ã�������
		InitTest i = new InitTest("s");
	}
}
