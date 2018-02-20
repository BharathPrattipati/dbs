package com.git.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TwoCharacters {

	static int twoCharaters(String s) {
        Map map = new HashMap();
        int len = 0;
        StringBuilder sb = new StringBuilder(s);
        
        System.out.println(s.replace("a", ""));
        s.charAt(0);
        
        
        
        /*for(int i=0;i<s.length();i++)
        {
        	int count =0;
        	for(int j=i+1;j<=s.length();j++)
        	{
        		if(ch[i] == ch[j])
        		{
        			count++;
        		}
        	}
        	
        	map.put(s.charAt(i),count);
        }*/
		return len;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharaters(s);
        System.out.println(result);
        in.close();
    }

}
