package other;

/**
 * ����ÿֻ3Ԫ��ĸ��ÿֻ5Ԫ��С����ֻ1Ԫ��100Ԫ��100ֻ���м�����
 * 
 * @author ASUS
 *
 */
public class Q049 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i <= 100 * 3; i += 3) {// ��С����ֻ��ֻ�������ı���
			for (int j = 0; j <= 100 / 3; j++) {// �򹫼���ֻ��
				for (int k = 0; k <= 100 / 5; k++) {// ��ĸ����ֻ��
					if (i / 3 + j * 3 + k * 5 == 100 && i + j + k == 100) {
						count++;
						System.out.println("С:" + i + " ��:" + j + "ĸ:" + k);
					}
				}
			}
		}
		System.out.println("��" + count + "���򷨣�");
	}

}
