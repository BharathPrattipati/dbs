package com.string.practice;

public class RotateString {

	public static void main(String[] args) {
		String s = "This is an example to reverse the string excluding words first letter";
		String[] st = s.split(" ");
		for(int i=0; i<st.length; i++)
		{
			int len = st[i].length();
			if(len >2)
			{
				st[i] = st[i].charAt(0)+(new StringBuffer(st[i].substring(1, len))).reverse().toString();
			}
			System.out.println(st[i]);
		}

	}

}
