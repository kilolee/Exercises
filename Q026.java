package other;

public class Q026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���������
		int random = (int) (Math.random() * Integer.MAX_VALUE + 1);
		// ת���ɶ������ַ���
		String str = Integer.toBinaryString(random);
		// ת���ɶ�����ʱ��ǰ����㱻ʡ�ԣ�����ʡ�Ե�0
		if (str.length() < 32) {
			for (int i = 0; i < 32 - str.length(); i++) {
				str = "0" + str;
			}
		}
		// �����鸳ֵ
		int[] a = new int[32];
		for (int i = 0; i < str.length(); i++) {
			a[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
			System.out.println("a[" + i + "]=" + a[i]);
		}
	}

}
