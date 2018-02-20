package com.git.practice;

import java.util.Scanner;

public class SuperReducedString {

	static String super_reduced_string(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i< sb.length()-1;i++)
        {
        	if(sb.charAt(i) == sb.charAt(i+1))
        	{
        		sb.delete(i,i+2);
        		i=-1;
        	}
        	
        }
		return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }

}
