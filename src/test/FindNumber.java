package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FindNumber {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10000;i++) {
			list.add(i);
		}
		Random r = new Random();
		int n1 = list.remove(r.nextInt(list.size()));
		int n2 = list.remove(r.nextInt(list.size()));
		System.out.println(n1+","+n2);
		Collections.shuffle(list);
		boolean[] b = new boolean[10000];
		for(int i : list) {
			b[i] = true;
		}
		for(int i=0;i<b.length;i++) {
			if(!b[i]) {
				System.out.println(i);
			}
		}
	}
}
