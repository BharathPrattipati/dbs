package com.git.random;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubArraySum1 {

	static long maximumSum(long[] a, long m) {
        long maxModuler = 0,temp,temp1;
        if(Arrays.binarySearch(a,m-1) > -1){
            return m-1;
        }
        
        for(int i=1;i<=a.length;i++){
            for(int j=0;j<=a.length-i;j++){
                temp =0L;
                for(int x=j;x<j+i;x++) {
                    temp+=a[x];
                }
                temp1 = temp%m;
                if(temp1 == m-1) {
                    return temp1;
                }
                if(temp1>maxModuler) {
                    maxModuler = temp1;
                }
            }
        }
        
        return maxModuler;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            long m = in.nextLong();
            long[] a = new long[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextLong();
            }
            long result = maximumSum(a, m);
            System.out.println(result);
        }
        in.close();
    }

}
