package other;

import java.util.ArrayList;
import java.util.List;

public class Q028 {
	public static List<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		group("", "122345");
		System.out.println(list.toString());

	}

	public static void group(String str, String nstr) {
		if (str.length() != nstr.length()) {
			String rest = getRest(str, nstr);
			for (int i = 0; i < rest.length(); i++) {
				String temp = str + rest.substring(i, i + 1);
				if (temp.indexOf("4") != 2 && temp.indexOf("35") == -1 && temp.indexOf("53") == -1) {
					// 把符合条件的字符串添加到集合中
					if (!list.contains(temp) && temp.length() == nstr.length()) {
						list.add(temp);
					}
					group(temp, nstr);
				}
			}
		}
	}

	private static String getRest(String str, String nstr) {
		// TODO Auto-generated method stub
		String rest = "";
		if (nstr.length() > str.length()) {
			rest = nstr;
			for (int i = 0; i < str.length(); i++) {
				rest = rest.replaceFirst(str.substring(i, i + 1), "");
			}
		}
		return rest;
	}

}
