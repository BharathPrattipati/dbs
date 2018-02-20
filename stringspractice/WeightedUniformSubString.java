package com.git.practice;

import java.util.Arrays;
import java.util.Scanner;

public class WeightedUniformSubString {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            StringBuilder sb = new StringBuilder();
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            for(int i=0; i<ch.length;i++)
            {
            	sb.append(ch[i]);
            }
            System.out.println(sb);
        }
    }

}
