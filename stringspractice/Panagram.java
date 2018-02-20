package com.git.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String res = "pangram";
		if(s.length()<26)
		{
			res = "non pangram";
		}
		for(char ch='A'; ch<='Z'; ch++)
		{
			if(s.indexOf(ch)<0 && s.indexOf((char) (ch + 32)) < 0)
			{
				res = "non pangram";
			}
		}
		System.out.println(res);
		//System.out.println((char)('A'+32));
	}

}
