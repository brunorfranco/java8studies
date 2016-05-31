package com.bruno.string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringsTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("bruno");
		list.add("leticia");
		list.add("vinicius");
		
		Comparator<String> c = Comparator.naturalOrder();
		
		int compare = c.compare("vinicius", "bruno");
		System.out.println(compare);
		
		
		Comparator<String> c2 = Comparator.nullsFirst(Comparator.naturalOrder());
		
		int compare2 = c2.compare("vinicius", null);
		System.out.println(compare2);
	}
}
