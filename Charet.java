package com.string.practice;

import java.util.HashMap;
import java.util.Map;

public class Charet {

	public static void main(String[] args) {
		int[] a = {203,204, 205, 206, 207, 208, 203, 204, 205, 206};
		int[] b = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};
		Map<Integer,Integer> a1 = frequency(a);
        Map<Integer,Integer> b1 = frequency(b);
        int j = 0;
        int[] result = new int[b.length-a.length];
        
        for(Map.Entry ent: b1.entrySet())
        {
            for(Map.Entry ent1 : a1.entrySet())
            {
                if(ent.getKey().equals(ent1.getKey()) && !(ent.getValue().equals(ent1.getValue())))
                {
                	result[j] = (Integer)ent.getKey();
                	j++;
                    System.out.println(ent.getKey());
                }
            }
        }
        for(int i=0; i<result.length; i++)
        {
        	System.out.println(result[i]);
        }
        
	}
	static Map<Integer,Integer> frequency(int[] arr)
    {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            int count = 0;
            for(int j=0; j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            map.put(arr[i],count);
        }
        return map;
    }

}
