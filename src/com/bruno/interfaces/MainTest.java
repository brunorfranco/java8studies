package com.bruno.interfaces;

public class MainTest {

	public static void main(String[] args) {
		ImplementationTest test = new ImplementationTest();
		boolean testDefaultConfig = test.testDefaultConfig(1);
		System.out.println("Testing it: "+ testDefaultConfig);
	}
}
