package other;
/**
 * ���1000���ڣ����Ա�5���������Ա�7������������5��7ͬʱ������������
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
