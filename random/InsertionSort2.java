package com.git.random;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort2 {

	static void insertionSort2(int n, int[] arr) {
        for(int i=0;i<n;i++)
        {
            
            if(i !=n-1)
            {
        	if(arr[i]>arr[i+1])
                {
                	arr[i] = arr[i] + arr[i+1];
                	arr[i+1] = arr[i] - arr[i+1];
                	arr[i] = arr[i] - arr[i+1];
                }
                Arrays.stream(arr).forEach(k -> System.out.print(k+" "));
                System.out.println();
            }else{
            	for(int j=0; j<n;j++)
            	{
            		if(arr[j]>arr[j])
            		{
            			 
            		}
            	}
            }
            
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort2(n, arr);
        in.close();
    }

}
