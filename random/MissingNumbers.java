package com.git.random;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MissingNumbers {

	static Map<Object,Integer> frequency(List a)
    {
        Map<Object,Integer> map = new HashMap<>();
        for(Object i: a)
        {
            map.put(i,Collections.frequency(a,i));
        }
        return map;
    }
    static int[] missingNumbers(int[] arr, int[] brr) {
        int[] res = new int[brr.length-arr.length];
        int j=0;
    	List<int[]> a = Arrays.asList(arr);
        List b = Arrays.asList(brr);
        Map<Object,Integer> ma = frequency(a);
        Map<Object,Integer> mb = frequency(b);
        Set<Object> set = mb.keySet();
        for(Object i : set)
        {
        	if(!(mb.get(i).equals(ma.get(i))))
        	{
        		res[j] = (Integer)i;
        		j++;
        	}
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] brr = new int[n];
        for(int brr_i = 0; brr_i < n; brr_i++){
            brr[brr_i] = in.nextInt();
        }
        int[] result = missingNumbers(arr, brr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

}
