package other;

/**
 * �ж���������(x,y)�Ĵ�С�������ش����ܷ�С������
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
