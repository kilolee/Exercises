package other;

/**
 * 判断俩个数字(x,y)的大小，并返回大数能否被小数整除
 * 
 * @author ASUS
 *
 */
public class Q042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = judge(10, 21);
		System.out.println(b);
	}

	private static boolean judge(int x, int y) {
		// TODO Auto-generated method stub
		return (x < y ? y % x : x % y) == 0;
	}

}
