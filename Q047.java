package other;

/**
 * ���9*9�˷��ھ�
 * 
 * @author ASUS
 *
 */
public class Q047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + " ");
			}
			System.out.println("\n");
		}
	}

}
