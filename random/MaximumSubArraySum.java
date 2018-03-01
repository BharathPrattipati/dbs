package com.git.random;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int res = 0;
		int min = 0;
		int[] ar = new int[n];
		int[] prear = new int[n];
		int max_so_far = 0;
		int max_ending_here = 0;
		
		for(int i=0;i<n;i++)
		{
			ar[i] = scan.nextInt();
		}
		/*prear[0] = ar[0];
		for(int i=1;i<n;i++)
		{
			prear[i] = prear[i-1] + ar[i];
		}
		//Arrays.stream(prear).forEach(System.out::print);
		for(int i=0;i<n;i++)
		{
			res = Math.max(res%7, (prear[i]-min)%7);
			min = Math.min(min, prear[i]);
			//System.out.print(res+" ");
		}*/
		max_so_far = ar[0];
		max_ending_here = ar[0];
		for(int i=0;i<n;i++)
		{
			//max_ending_here = max()
		}
		
		System.out.println(res);
	}

}
