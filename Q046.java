package other;

import java.util.Scanner;

/**
 * �жϴӼ��̽��յ������Ƿ�Ϊ��������
 * 
 * @author ASUS
 *
 */
public class Q046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		long inputValueLong = scanner.nextLong();
		long temp = inputValueLong;
		long reverseLong = 0L;
		while (inputValueLong != 0) {
			reverseLong = reverseLong * 10 + inputValueLong % 10;
			inputValueLong = inputValueLong / 10;
		}
		if (reverseLong == temp) {
			System.out.println("��������ǻ�����");
		} else {
			System.out.println("������Ĳ��ǻ�����");
		}
	}
}
