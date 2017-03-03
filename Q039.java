package other;

/**
 * 1000-2000可以能被3整除的数
 * 
 * @author ASUS
 *
 */
public class Q039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1000; i <= 2000; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}
