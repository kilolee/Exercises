package other;

import java.util.Arrays;

/**
 * 生成一个六位数的验证码，包括大写字母、小写字母和数字
 * 
 * @author ASUS
 *
 */
public class Q045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] letters = { "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "L", "K", "J", "H", "G", "F", "D", "S",
				"A", "Z", "X", "C", "V", "B", "N", "M", "q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "l", "k", "j",
				"h", "g", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m", "0", "1", "2", "3", "4", "5",
				"6", "7", "8", "9" };
		boolean[] flags = new boolean[letters.length];
		String[] chs = new String[6];
		for (int i = 0; i < chs.length; i++) {
			int index;
			do {
				index = (int) (Math.random() * (letters.length));
			} while (flags[index]);
			chs[i] = letters[index];
			flags[index] = true;
		}
		String code = Arrays.toString(chs);
		System.out.println(code);
	}

}
