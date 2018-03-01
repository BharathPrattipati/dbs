package com.git.random;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SubStrings {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        String s = in.next();
        for(int a0 = 0; a0 < q; a0++){
            int left = in.nextInt();
            int right = in.nextInt();
            Set<String> set = new TreeSet<String>();
            String s1 = s.substring(left,right+1);
            if(s1.length()==1)
            {
            	set.add(s1);
            }
            else{
            for(int i=0; i<s1.length();i++)
            {
            	for(int j=i+1; j<=s1.length();j++)
            	{
            		set.add(s1.substring(i, j));
            	}
            }
            }
            System.out.println(set.size());
        }
    }

}
