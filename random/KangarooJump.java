package com.git.random;

import java.util.Arrays;
import java.util.Scanner;

public class KangarooJump {

	static String kangaroo(int x1, int v1, int x2, int v2) {
        String res = "NO";
        if((x1-x2) % (v1-v2) == 0)
        {
        	res = "YES";
        }
        
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }

}
