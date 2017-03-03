package other;

/**
 * 公鸡每只3元，母鸡每只5元，小鸡三只1元，100元买100只鸡有几种买法
 * 
 * @author ASUS
 *
 */
public class Q049 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i <= 100 * 3; i += 3) {// 买小鸡的只数只能是三的倍数
			for (int j = 0; j <= 100 / 3; j++) {// 买公鸡的只数
				for (int k = 0; k <= 100 / 5; k++) {// 买母鸡的只数
					if (i / 3 + j * 3 + k * 5 == 100 && i + j + k == 100) {
						count++;
						System.out.println("小:" + i + " 公:" + j + "母:" + k);
					}
				}
			}
		}
		System.out.println("共" + count + "种买法！");
	}

}
