package other;

public class Q020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(getBinary(13));
	}

	/**
	 * 计算二进制中1的个数
	 * @param num
	 * @return
	 */
	public static int getBinary(int num) {
		if (num == 1) {
			return 1;
		}
		if (0 == num % 2) {// num是偶数
			return getBinary(num / 2);
		} else {
			return getBinary(num / 2) + 1;
		}

	}
}
