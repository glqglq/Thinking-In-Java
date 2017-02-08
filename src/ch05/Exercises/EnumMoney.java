package ch05.Exercises;
/**
 * Exercise-5.21
 * @author LuckyGong
 *
 */
public class EnumMoney {
	enum money{
		ONE,FIVE,TEN,TWENTY,FIFTY,HUNDRED;
	}
	public static void main(String[] args) {
		for(money m:money.values())
			System.out.println(m);
	}
}
