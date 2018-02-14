package com.arrays.practice;

import java.util.Arrays;

public class SubArrays {

	public static void main(String[] args) {
		int k = 0;
		int n = 3;
		int[][] a = new int[n][n]; 
		for(int i=0; i<n; i++)
		{
			for(int j= 0; j<n; j++)
			{
				a[i][j] = k;
				k++;
			}
		}
		int[][] b = Arrays.copyOf(a, 3);
		for(int i=0;i<n; i++)
		{for(int j=0; j<n;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
		}
		for(int i=0;i<n; i++)
		{for(int j=0;j<n; j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
		}
		System.out.println(Arrays.deepEquals(a, b));
	}

}
