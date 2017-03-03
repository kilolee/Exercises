package other;

import java.util.Scanner;

public class Q030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		while (true) {
			System.out.println("请输入账号");
			String name = scanner.nextLine();
			System.out.println("请输入密码");
			String pwd = scanner.nextLine();
			if ("admin".equals(name) && "admin".equals(pwd)) {
				System.out.println("登陆成功");
				break;
			} else {
				count++;
				if (count < 3) {
					System.out.println("登陆失败，请重新输入");
				} else {
					System.out.println("登陆次数过多，认证失败");
					break;
				}
			}

		}

	}

}
