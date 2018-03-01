package com.git.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClosestNumbers2 {

	static Object[] closestNumbers(int[] a) {
		int diff = 0;
		int min = Integer.MAX_VALUE;
	    Arrays.sort(a);
	    /*Arrays.stream(a).forEach(System.out::print);
	    diff = a[a.length-1] - a[a.length-2];*/
	    System.out.println(diff);
		List<Integer> l = new ArrayList(); 
	        for(int i=0;i<a.length-1;i++)
	        {
	        	for(int j=i+1;j<a.length;j++)
	        	{
	        		diff =  a[j]-a[i];
	        		if(min>diff)
	        		{
	        			min = diff;
	        			l.clear();
	        		}
	        		if(min == diff)
	        		{
	        			l.add(a[i]);
	        			l.add(a[j]);
	        		}
	        		
	        	}
	        }
	        Collections.sort(l);
			return l.toArray();
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int arr_i = 0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        Object[] result = closestNumbers(arr);
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
	        }
	        System.out.println("");


	        in.close();
	    }

}
