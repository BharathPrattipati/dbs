package com.string.practice;

public class Replacement {

	public static void main(String[] args) {
		String s = "This was is was a was test was string was to was test was the was replacement was functionality";
		System.out.println(s);
		System.out.println(s.replace("t", "z"));
		System.out.println(s);
		s=s.replaceAll("was", "");
		System.out.println(s);
		
		
	}

}
