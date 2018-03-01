package com.git.random;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSumArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		int[] prear = new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i] = scan.nextInt();
		}
		prear[0] = ar[0];
		for(int i=1;i<n;i++)
		{
			prear[i] = ar[i-1] + ar[i];
		}
		Arrays.stream(prear).forEach(System.out::print);
	}

}
