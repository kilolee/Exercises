package other;

public class Q048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = getAge(a);
		System.out.println(b);
	}

	public static int getAge(int a) {
		if (a == 1) {
			return 10;
		} else {
			return getAge(a - 1) + 2;
		}
	}
}
