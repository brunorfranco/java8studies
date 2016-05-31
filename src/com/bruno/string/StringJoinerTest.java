package com.bruno.string;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
		
		StringJoiner string1 = new StringJoiner(" Bruno ");
		string1.add(" Rodrigues ");
		string1.add(" Franco ");
		StringJoiner other = new StringJoiner(" Ana ");
		other.add(" Carolina ");
		string1.merge(other);
		
		System.out.println(string1);
		
	}
	
}
