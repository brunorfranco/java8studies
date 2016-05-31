package com.bruno.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "bruno");
		map1.put(2, "italo");
		map1.put(3, "maro");
		
		map1.forEach((key, name) -> System.out.println(key + " " + name));
	}
	
}
