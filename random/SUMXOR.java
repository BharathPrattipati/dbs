package com.git.random;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.LongStream;

public class SUMXOR {

	static long solve(long n) {
        /*long count = 0;
        System.out.println(LongStream.range(0, n+1).filter( i -> (n+i == (n^i))).count());
        
        for(int i=0; i<=n; i++)
        {
            if((n+i) == (n^i))
            {
                count++;
            }
        }*/
		BigInteger bg = new BigInteger(Long.toString(n));
		return (long) Math.pow(2, bg.bitLength()-bg.bitCount());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long result = solve(n);
        System.out.println(result);
    }

}
