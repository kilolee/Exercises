package other;

public class Q020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(getBinary(13));
	}

	/**
	 * �����������1�ĸ���
	 * @param num
	 * @return
	 */
	public static int getBinary(int num) {
		if (num == 1) {
			return 1;
		}
		if (0 == num % 2) {// num��ż��
			return getBinary(num / 2);
		} else {
			return getBinary(num / 2) + 1;
		}

	}
}
