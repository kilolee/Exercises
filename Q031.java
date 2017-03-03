package other;

/**
 * 杨辉三角
 * 
 * @author ASUS
 *
 */
public class Q031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("*");
			}
			// 打印空格后面的字符，从第一列开始往后打印
			for (int j = 1; j <= i; j++) {
				System.out.print(num(i, j) + "&");
			}
			System.out.println();
		}
	}

	/**
	 * 
	 * @param x
	 *            第x行
	 * @param y
	 *            第y列
	 * @return
	 */
	private static int num(int x, int y) {
		// TODO Auto-generated method stub
		if (y == 1 || y == x) {
			return 1;
		}
		int c = num(x - 1, y - 1) + num(x - 1, y);
		return c;
	}
}
