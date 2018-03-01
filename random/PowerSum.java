package com.git.random;

import java.util.Scanner;

public class PowerSum {

	static int powerSum(int X, int N) {
        return N;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        int result = powerSum(X, N);
        System.out.println(result);
        in.close();
    }

}
