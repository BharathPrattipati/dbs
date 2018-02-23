package com.git.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FullSorting {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //List<String> list = new ArrayList<String>();
        String[] ar = new String[n];
        String[] ar1 = new String[n];
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            String s = in.next();
            if(a0<n/2)
            {
            	ar[a0] = x+" "+s+"-";
            }
            else{
            	ar[a0] = x+" "+s;	
            }
        }
        ar1 = ar;
        Arrays.sort(ar, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				if(Integer.valueOf(o1.split(" ")[0])<Integer.valueOf(o2.split(" ")[0]))
				{
					return -1;
				}
				else if(Integer.valueOf(o1.split(" ")[0])>Integer.valueOf(o2.split(" ")[0]))
				{
					return 1;
				}
				else{
					return 0;
				}
			}});
        Arrays.stream(ar).forEach(System.out::println);
        System.out.println();
        for(String s: ar)
        {
        	if(s.contains("-"))
        	{
        		System.out.print("-"+" ");
        	}
        	else
        	{
        		System.out.print(s.substring(s.indexOf(" ")+1,s.length())+" ");
        	}
        }
        in.close();
    }

}
