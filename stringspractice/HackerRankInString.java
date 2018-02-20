package com.git.practice;

import java.util.Scanner;

public class HackerRankInString {

	static String hackerrankInString(String s) {
		//CharSequence
		//ring res = "NO";
		int j=0;
		String str = "hackerrank";
		if(s.length() < str.length())
		{
			return "NO";
		}
		for(int i=0; i< s.length();i++)
		{
			if(j<str.length() && s.charAt(i)==str.charAt(j))
			{
				j++;
			}
		}
		return (j==str.length() ? "YES" : "NO");
      }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();
    }

}