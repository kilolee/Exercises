package other;

/**
 * 实现abc值的循环移位
 * 
 * @author ASUS
 *
 */
public class Q038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 2, c = 5;
		a = b - a;
		b = b - a;
		a = a + b;
		b = c - b;
		c = c - b;
		b = b + c;
		System.out.println("a:" + a + " b:" + b + " c:" + c);
	}

}
