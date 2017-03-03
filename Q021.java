package other;

public class Q021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 5;
		System.out.println(doFactorial(n));
	}

	/**
	 * Çón!
	 * 
	 * @param n
	 * @return
	 */
	public static long doFactorial(long n) {
		if (n < 1) {
			System.out.println("ERROR");
			return 0;
		} else if (n == 1 || n == 2) {
			return n;
		} else {
			return n * doFactorial(n - 1);
		}
	}
}
