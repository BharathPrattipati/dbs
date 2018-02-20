package com.git.practice;

import java.util.Scanner;

public class MarsExploration {

	static int marsExploration(String s) {
        int res = 0;
        int len = s.length()/3;
        StringBuilder sb = new StringBuilder("SOS");
        for(int i=1;i<len;i++)
        {
        	sb.append("SOS");
        }
        for(int i =0; i< s.length(); i++)
        {
        	if(sb.charAt(i) != s.charAt(i))
        	{
        		res++;
        	}
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }

}
