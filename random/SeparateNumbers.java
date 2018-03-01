package com.git.random;

import java.util.Scanner;

public class SeparateNumbers {

	static long separateNumbers(String s) {
        if (s.charAt(0) == '0') {
			return -1;
		}

		for (int length = 1; length * 2 <= s.length(); length++) {
			long firstNumber = Long.parseLong(s.substring(0, length));

			StringBuilder sequence = new StringBuilder();
			long number = firstNumber;
			while (sequence.length() < s.length()) {
				sequence.append(number);
				number++;
			}
			if (sequence.toString().equals(s)) {
				return firstNumber;
			}
		}
		return -1;
	}
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
           // separateNumbers(s);
            long result = separateNumbers(s);
			System.out.println(result > 0 ? "YES " + result : "NO");
        }
        in.close();
    }

}
