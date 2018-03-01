package com.git.random;

import java.util.Scanner;

public class Grades {

	static int[] solve(int[] grades){
        for(int i=0; i<grades.length;i++)
        {
            int rem = grades[i]%10;
            int ac = rem>5?10 - rem:5-rem;
            if(ac<3 && grades[i]>=38)
            {
                grades[i]+=ac; 
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }

}
