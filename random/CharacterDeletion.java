package com.git.random;

import java.util.Scanner;

public class CharacterDeletion {

	static int alternatingCharacters(String s){
        int count = 0;
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length()-2;i++)
        {
        	for(int j=i+1; j<=sb.length()-1;j++)
        	{
        		if(sb.charAt(i)==sb.charAt(j))
        		{
        			count++;
        			sb.deleteCharAt(j);
        			j = i+1;
        		}
        		else
        		{
        			break;
        		}
        	}
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }

}
