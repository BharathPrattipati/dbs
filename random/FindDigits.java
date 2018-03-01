package com.git.random;

import java.util.Scanner;

public class FindDigits {

	static int findDigits(int n) {
        int temp = n;
        int count = 0;
        int rem = temp%10;
        while(temp >0)
        {
        	if((rem !=0 ) && (n%rem) == 0)
            {
            	count++;
            }
            temp = temp/10;
            rem = temp%10;
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int result = findDigits(n);
            System.out.println(result);
        }
        in.close();
    }

}
