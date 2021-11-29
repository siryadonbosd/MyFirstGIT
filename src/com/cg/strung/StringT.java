package com.cg.strung;

public class StringT {

	public static void main(String[] args) {
		String str = "Helloaa"; // String literal
		modify(str);// String is immutable
		System.out.println("after modify str: " + str);
		StringBuilder sb = new StringBuilder("Hello2");
		modify(sb);// use StringBuilder if we need mutable object
		System.out.println("after modify sb: " + sb);
	}	
	private static void modify(String str) {
		str.concat(" guys");
		System.out.println("here str: " + str);
		
		
	}
	private static void modify(StringBuilder sb) {
		sb.append(" guys");		
		
	}

	}
