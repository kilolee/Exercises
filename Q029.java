package other;

import java.util.Arrays;
import java.util.Scanner;

public class Q029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[2];
		System.out.println("�������һ��������");
		nums[0] = scanner.nextInt();
		System.out.println("������ڶ�������");
		nums[1] = scanner.nextInt();
		Arrays.sort(nums);
		int sum = 0;
		for (int i = nums[0] + 1; i < nums[1]; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
