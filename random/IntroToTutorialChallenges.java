package com.git.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntroToTutorialChallenges {

	static int introTutorial(int V, List<Integer> list) {
        
        
        return list.lastIndexOf(V);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int arr_i = 0; arr_i < n; arr_i++){
            list.add(in.nextInt());
        }
        int result = introTutorial(V, list);
        System.out.println(result);
        in.close();
    }

}
