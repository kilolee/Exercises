package other;

public class Q026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 产生随机数
		int random = (int) (Math.random() * Integer.MAX_VALUE + 1);
		// 转换成二进制字符串
		String str = Integer.toBinaryString(random);
		// 转换成二进制时最前面的零被省略，补上省略的0
		if (str.length() < 32) {
			for (int i = 0; i < 32 - str.length(); i++) {
				str = "0" + str;
			}
		}
		// 给数组赋值
		int[] a = new int[32];
		for (int i = 0; i < str.length(); i++) {
			a[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
			System.out.println("a[" + i + "]=" + a[i]);
		}
	}

}
