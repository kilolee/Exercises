package other;

/**
 * ��1020�����ϣ���һ����һ����������Ժ�ÿ����ʣ�µ�һ�������������������
 * 
 * @author ASUS
 *
 */
public class Q050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int num = 1020;
		for (i = 1;; i++) {
			num = num - (num / 2 + 2);// ��������ʣ�¶��ٸ�
			System.out.println("��"+i+"���ʣ��"+num+"��");
			if (num == 0) 
				break;			
		}
		System.out.println(i+"�����꣡");
	}

}
