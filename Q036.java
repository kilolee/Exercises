package other;
/**
 * �ҳ�101-200��Ȼ���е�������forѭ��Խ��Խ��
 * @author ASUS
 *
 */
public class Q036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 101; i <= 200; i++) {
			boolean tag = true;
			for (int j = 2; j < i; j++) {
				if ((i % j == 0) && (j != i)) {
					tag = false;
					break;
				}
			}
			if (tag) {
				System.out.println(i);
			}
		}
	}

}
