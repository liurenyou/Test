package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 控制台输入一组小写字母，输出每种字母的个数
 * 
 * @author liurenyou
 *
 */

public class CountLetters {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while (true) {
			String text = scan.next();
			String reg = "^[a-z]+$";
			if (text.matches(reg)) {
				int count = 0;
				Map<Character, Integer> m = new HashMap<Character, Integer>();
				for (int i = 0; i < text.length(); i++) {
					char a = text.charAt(i);
					if (m.get(a) == null) {
						count = 1;
						m.put(a, count);
					} else {
						count = m.get(a);
						m.put(a, ++count);
					}
				}
				for (Character a : m.keySet()) {
					count = m.get(a);
					System.out.println(a + "个数：" + count + "\t");
				}
				break;
			}
			System.out.println("请输入小写字母");
		}
	}
}
