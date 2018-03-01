package com.git.random;

import java.util.Arrays;
import java.util.Scanner;

public class RadioTransmitter {

	static int hackerlandRadioTransmitters(int[] x, int k) {
		Arrays.sort(x);
		
		
		int count = 0;
        int tr = x[0];
        if(k<x[x.length-1])
        {
        	tr = tr+k;
        	//count++;
        }
		for(int i=tr; i<=x[x.length-1];i++)
        {
        	if(tr <= x[x.length-1])
        	{
        		
        		count++;
        		tr = (tr + (2*k)+1) > x[x.length-1] ? tr+k+1 : tr +(2*k)+1 ;
        		//System.out.println(tr);
        	}
        }
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i = 0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
        int result = hackerlandRadioTransmitters(x, k);
        System.out.println(result);
        in.close();
    }

}
