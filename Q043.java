package other;

public class Q043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hex = hexConvert(8);
		System.out.println(hex);
	}

	/**
	 * 将一个整型十进制数转化为二进制数
	 * 
	 * @param d
	 * @return
	 */
	public static String hexConvert(int d) {
		String s = "";
		do {
			int f = d % 2;
			if (f == 1) {
				s = "1" + s;
			} else if (f == 0) {
				s = "0" + s;
			}
			d /= 2;
		} while (d != 0);
		return s;
	}

}
