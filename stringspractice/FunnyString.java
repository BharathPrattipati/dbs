package com.git.practice;

import java.util.Scanner;

public class FunnyString {

	static String funnyString(String s){
        char[] ch = s.toCharArray();
        String result = "Funny";
        for(int i=0,j=ch.length-2;i<j;i++,j--)
        {
        	if(Math.abs(ch[i]-ch[i+1]) != Math.abs(ch[j]-ch[j+1]))
        	{
        		result = "Not Funny";
        	}
        }
		return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }

}
