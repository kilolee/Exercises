package other;

public class Q027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] b = new int[] { 1, 2, 5, 10, 4, 8, 9, 6 };
		int[] a = new int[10];
		for (int t : b) {
			a[t - 1] = t;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				System.out.println(i + 1);
			}
		}
	}

}
