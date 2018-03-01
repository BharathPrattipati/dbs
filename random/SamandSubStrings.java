package com.git.random;

import java.util.Scanner;

public class SamandSubStrings {

	static int substrings(String balls) {
        long res = 0;
        /*for(int i=0;i<balls.length();i++)
        {
            for(int j=i+1;j<=balls.length();j++)
            {
                res+=Long.valueOf(balls.substring(i,j));
            }
        }*/
        //char[] ch = balls.toCharArray();
        for(int i=0;i<balls.length();i++)
        {
        	//res = Integer.valueOf(balls.charAt(i))*
        }
        return Double.valueOf(res%(Math.pow(10,9)+7)).intValue();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String balls = in.next();
        int result = substrings(balls);
        System.out.println(result);
        in.close();
    }

}
