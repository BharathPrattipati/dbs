package com.git.random;

import java.util.Scanner;

public class AppleandOranges {

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int cnt[] = new int[2];
        for(int i=0;i<apples.length;i++)
        {
        	int res = a + apples[i];
        	if(res>=s && res <=t)
        	{
        		cnt[0]++;
        	}
        }
        for(int i=0;i<oranges.length;i++)
        {
        	int res = b + oranges[i];
        	if(res>=s && res <=t)
        	{
        		cnt[1]++;
        	}
        }
        for(int i=0;i<cnt.length;i++)
        {
        	System.out.print(cnt[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }

}
