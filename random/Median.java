package com.git.random;

import java.util.Arrays;
import java.util.Scanner;

public class Median {

	static int findMedian(int[] arr) {
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(System.out::print);
        return arr[(arr.length)/2];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = findMedian(arr);
        System.out.println(result);
        in.close();
    }
}
