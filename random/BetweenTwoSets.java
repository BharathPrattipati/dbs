package com.git.random;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BetweenTwoSets {

static int getTotalX(int[] a, int[] b, int n, int m) {
        int count = 0;
        int lcm = a[0],gcd= b[0];
        boolean temp = true;
        BigInteger bg = BigInteger.valueOf(a[0]);
        BigInteger bg1 = BigInteger.valueOf(b[0]);
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<n;i++)
        {
        	bg = BigInteger.valueOf(a[i]).multiply(bg).divide(bg.gcd(BigInteger.valueOf(a[i])));
        }
        for(int i=1;i<m;i++)
        {
        	bg1 = bg1.gcd(BigInteger.valueOf(b[i]));
        }
        for(int i=bg.intValue();i<=bg1.intValue();i++)
        {
        	//System.out.print(i+" ");
        	if(bg1.intValue()%i==0)
        	{
        		list.add(i);
        	}
        }
        for(int in : list)
        {
        	temp = true;
        	for(int i=0; i<n;i++)
        	{
        		if(in%a[i] !=0 )
        		{
        			System.out.println("in : "+in+"arr : "+a[i]);
        			temp = false;
        			break;
        		}
        	}
        	if(temp)
        	{
        		count++;
        	}
        		
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
