package com.git.practice;

import java.util.Scanner;

public class CamelCase {

	
		static int camelcase(String s) {
	        String[] st = s.split("[A-Z]");
	        return st.length;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        int result = camelcase(s);
	        System.out.println(result);
	        in.close();
	    }

	

}
