package com.git.random;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	static void insertionSort1(int n, int[] arr) {
		int temp = arr[n-1];
        for(int i=n-2 ;i>=0;i--)
        {
            if(arr[i]>temp && i !=0)
            {
                arr[i+1] = arr[i] ;
            }
            else if(arr[i]>temp && i ==0)
            {
            	
            	arr[i+1] = arr[i] ;
            	Arrays.stream(arr).forEach(k -> System.out.print(k+" "));
            	System.out.println();
            	arr[i] = temp;
            	break;
            }
            else
            {
                arr[i+1] = temp;
                break;
            }
            Arrays.stream(arr).forEach(k -> System.out.print(k+" "));
            System.out.println();
        }
        Arrays.stream(arr).forEach(k -> System.out.print(k+" "));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
        in.close();
    }

}
