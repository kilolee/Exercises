package other;

public class Q040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��1���µ����Ӷ�����1");
		System.out.println("��2���µ����Ӷ�����1");
		int f, f1 = 1, f2 = 1, m = 24;
		for (int i = 3; i <= m; i++) {
			f = f2;
			f2 = f1 + f2;//ǰ������f2���
			f1 = f;
			System.out.println("��" + i + "���µ����Ӷ���" + f2);
		}
	}

}
