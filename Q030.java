package other;

import java.util.Scanner;

public class Q030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		while (true) {
			System.out.println("�������˺�");
			String name = scanner.nextLine();
			System.out.println("����������");
			String pwd = scanner.nextLine();
			if ("admin".equals(name) && "admin".equals(pwd)) {
				System.out.println("��½�ɹ�");
				break;
			} else {
				count++;
				if (count < 3) {
					System.out.println("��½ʧ�ܣ�����������");
				} else {
					System.out.println("��½�������࣬��֤ʧ��");
					break;
				}
			}

		}

	}

}
