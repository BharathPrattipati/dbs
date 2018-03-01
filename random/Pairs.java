package com.git.random;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {

	static int pairs(int k, int[] a) {
        int count = 0;
        Arrays.sort(a);
        
        
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(k == (a[j]-a[i]))
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = pairs(k, arr);
        System.out.println(result);
        in.close();
    }

}
