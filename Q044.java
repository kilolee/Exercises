package other;
/**
 * 输出1000以内，可以被5整除，可以被7整除，但不被5和7同时整除的所有数
 * @author ASUS
 *
 */
public class Q044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide();
	}

	public static void divide() {
		for (int i = 0; i < 1000; i++) {
			if (i % 5 == 0 && i % 7 != 0 || i % 5 != 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
}
