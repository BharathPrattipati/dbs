package com.git.random;

import java.util.Arrays;
import java.util.Scanner;

public class MigratoryBirds {

	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        int max = 0;int result = 0;
		    int count[] = new int[n];   
	        for(int ar_i = 0; ar_i < n; ar_i++){
		            ar[ar_i] = in.nextInt();
		        }
		        for(int i : ar)
		        {
		            count[i]++;
		        }
		        max = Arrays.stream(count).max().getAsInt();
		        for(int i : ar)
		        {
		        	if(max == count[i])
		        	{
		        		result = i;
		        	}
		        }
		       
		        
		        System.out.println(result);
	    }

}
