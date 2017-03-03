package other;

import java.util.Scanner;

/**
 * 判断从键盘接收的数字是否为回文数字
 * 
 * @author ASUS
 *
 */
public class Q046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入数字");
		long inputValueLong = scanner.nextLong();
		long temp = inputValueLong;
		long reverseLong = 0L;
		while (inputValueLong != 0) {
			reverseLong = reverseLong * 10 + inputValueLong % 10;
			inputValueLong = inputValueLong / 10;
		}
		if (reverseLong == temp) {
			System.out.println("你输入的是回文数");
		} else {
			System.out.println("你输入的不是回文数");
		}
	}
}
