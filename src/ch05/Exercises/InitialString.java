package ch05.Exercises;
/**
 * Exercise-5.2
 * @author LuckyGong
 *���ۣ��ȳ�ʼ������ʱ�ͱ���ʼ���˵����ٳ�ʼ����������ʼ������
 */
class TT{
	String s1 = "String1";
	String s2;
	TT(){
		s2 = "String2";
	}
}
public class InitialString {
	public static void main(String[] args) {
		TT t = new TT();
		System.out.println(t.s1);
		System.out.println(t.s2);
	}
}
