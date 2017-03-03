package other;

/**
 * 有1020个西瓜，第一天卖一半多俩个，以后每天卖剩下的一半多俩个，几天能卖完
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
			num = num - (num / 2 + 2);// 当天卖后剩下多少个
			System.out.println("第"+i+"天后剩下"+num+"个");
			if (num == 0) 
				break;			
		}
		System.out.println(i+"天卖完！");
	}

}
