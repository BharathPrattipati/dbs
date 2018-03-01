package com.git.random;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class GemStones {

	static int gemstones(String[] arr){
        
        int cnt = 0;
        for(char ch='a';ch<='z';ch++)
        {
        	int count = 0;
        	for(int i=0; i<arr.length;i++)
        	{
        		if(arr[i].contains(Character.toString(ch)))
        		{
        			count++;
        		}
        	}
        	if(count == arr.length)
        	{
        		cnt++;
        	}
        }
        
        
		return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }

}
