package other;

/**
 * �ж�������Ƿ�Ϊ����
 * 
 * @author ASUS
 *
 */
public class Q034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prime(5));
	}

	/**
	 * �ж�n�Ƿ�Ϊ����
	 * 
	 * @param n
	 * @return
	 */
	public static boolean prime(int n) {
		if (n <= 0)
			System.exit(0);
		for (int i = 2; i <= n; i++)
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if ((n % j == 0) && (j != n)) {
					return false;
				}
			}
		return true;
	}
}
