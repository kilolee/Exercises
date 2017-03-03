package other;

/**
 * 1-100自然数，放入到a[99]这个数组中，写一个函数找出没有被放进数组的那个数字
 * 
 * @author ASUS
 *
 */
public class Q035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = new int[99];
		for (int i = 0; i < 99; i++) {
			b[i] = i + 1;
		}
		int[] a = new int[100];
		for (int t : b) {
			a[t - 1] = t;
		}
		for (int t = 0; t < a.length; t++) {
			if (a[t] == 0) {
				System.out.println(t + 1);
			}
		}
	}
}
