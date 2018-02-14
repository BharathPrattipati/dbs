package com.string.practice;

public class CharacterCount {

	public static void main(String[] args) {
		String s = "This is to find the repetition of t";
		int count = 0;
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			if("t".equalsIgnoreCase(Character.toString(s.charAt(i))))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
