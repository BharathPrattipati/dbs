package com.git.random;

import java.util.Scanner;

public class BreakingRecords {

	static int[] breakingRecords(int[] score) {
        int min = score[0];
        int max = score[0];
        int cnt[] = new int[2];
        for(int i=1;i<score.length;i++)
        {
            if(min>score[i])
            {
                min = score[i];
                cnt[1]++;
            }
            if(max<score[i])
            {
                max = score[i];
                cnt[0]++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

}
