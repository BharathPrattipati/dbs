package com.git.random;

import java.util.Scanner;

public class ShortPolindrome {

static int shortPalindrome(String s) {
    if(s.length()<4)
    {
    	return 0;
    }
    else{
    	
    }
	return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = shortPalindrome(s);
        System.out.println(result);
        in.close();
    }

}
