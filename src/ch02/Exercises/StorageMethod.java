package ch02.Exercises;
/*Exercise-2.6
 * */
public class StorageMethod {
	private static int storage(String s){
		return s.length() * 2;
	}
	public static void main(String[] args) {
		System.out.println(storage("156"));
	}
}

//Ҳ����������
//���������࣬Ȼ��new�������Ͳ��������new���������
//public class StorageTest {	
//	public static void main(String[] args) {
//		class StoreStuff {
//			int storage(String s) {
//				return s.length() * 2;
//			}	
//		}
//		StoreStuff x = new StoreStuff();
//		System.out.println(x.storage("hi"));		
//	}
//}