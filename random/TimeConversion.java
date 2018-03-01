package com.git.random;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConversion {

	static String timeConversion(String s) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat sf1 = new SimpleDateFormat("hh:mm:ssa");
        return sf.format(sf1.parse(s));
         
    }

    public static void main(String[] args) throws ParseException  {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }

}
