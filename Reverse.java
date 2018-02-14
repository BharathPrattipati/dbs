package com.string.practice;

public class Reverse {

	public static void main(String[] args) {
		String s = "This is for testing reverse functionality";
		StringBuffer sb = new StringBuffer(s);
		StringBuilder sbu = new StringBuilder(s);
		System.out.println(sb.append(" testing the appending functionality"));
		System.out.println(sbu.reverse());

	}

}
