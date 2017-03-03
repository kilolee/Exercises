package other;

public class Q040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("第1个月的兔子对数：1");
		System.out.println("第2个月的兔子对数：1");
		int f, f1 = 1, f2 = 1, m = 24;
		for (int i = 3; i <= m; i++) {
			f = f2;
			f2 = f1 + f2;//前后俩次f2相加
			f1 = f;
			System.out.println("第" + i + "个月的兔子对数" + f2);
		}
	}

}
