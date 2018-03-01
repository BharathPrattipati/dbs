package com.git.random;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

	static int minimumNumber(int n, String password) {
		int cnt = 0;
		int res = 0;
		
        	if(!Pattern.matches(".*[0-9].*", password))
        	{
        		System.out.println("digits missing");
        		cnt++;
        	}
        	if(!Pattern.matches(".*[a-z].*", password))
        	{
        		cnt++;
        	}
        	if(!Pattern.matches(".*[A-Z].*", password))
        	{
        		cnt++;
        	}
        	if(!Pattern.matches(".*[!@#$%\\^&*()\\-+].*", password))
        	{
        		System.out.println("specialcharacter missing");
        		cnt++;
        	}
        	if(password.length()<6)
        	{
        		int i = 6-password.length();
                res = (i==cnt) ? i : ((i < cnt) ? cnt : i) ;
        	}
        	else
        	{
        		res = cnt;
        	}
        	
        	
       
		return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }

}
