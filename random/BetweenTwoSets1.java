package com.git.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BetweenTwoSets1 {

	static int getTotalX(int[] a, int[] b,int n, int m) {
        Arrays.sort(b);
        Arrays.sort(a);
        int bLow = b[0],aHeight=a[a.length-1],count=0;
        boolean temp =true;
        List<Integer> bList = new ArrayList<Integer>();
        for(int i=bLow;i>=aHeight;i--) {
            temp = true;
            for(int j=0;j<b.length;j++) {
                if(b[j]%i!=0) {
                    temp = false;break;
                }
            }
            if(temp)
                bList.add(i);
        }
        System.out.println(bList);
        for(int bR : bList) {
            temp = true;
            for(int i=0;i<a.length;i++) {
                if(bR%a[i]!=0) {
                    temp = false;break;
                }
            }
            if(temp)
                count++;
        }
        return count;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b,n,m);
        System.out.println(total);
        in.close();
    }

}
