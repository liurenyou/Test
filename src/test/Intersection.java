package test;

import java.util.ArrayList;
import java.util.List;

/**
 * 两个集合，找出两个集合的交集，并按照升序排序输出
 * 
 * @author liurenyou
 *
 */

public class Intersection {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(66);
		list1.add(12);
		list1.add(34);
		list1.add(11);
		list1.add(15);
		list1.add(13);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(3);
		list2.add(2);
		list2.add(4);
		list2.add(11);
		list2.add(13);
		list2.add(14);
		list2.add(15);
		list2.add(12);
		list2.add(66);
		list2.add(17);

		List<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(list1);
		list3.retainAll(list2);
		list3.sort(null);
		for (Integer i : list3) {
			System.out.println(i);
		}
	}
}
