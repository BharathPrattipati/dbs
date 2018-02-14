package com.string.practice;

public class SwitchTest {

	public static void main(String[] args) {
		int i = 3;
		//float f = 0.0f;
		String s = "two";
		char ch = 'c';
		switch(i)
		{
		case 0 : System.out.println("selected 0");
		break;
		case 1 : System.out.println("selected 1");
		break;
		case 2 : System.out.println("selected 2");
		break;
		default : System.out.println("option not available");
		}
		switch(ch)
		{
		case 'a' : System.out.println("selected a");
		break;
		case 'b' : System.out.println("selected b");
		break;
		case 'c' : System.out.println("selected c");
		break;
		default : System.out.println("option not available");
		}
		switch(s)
		{
		case "one" : System.out.println("selected one");
		break;
		case "two" : System.out.println("selected two");
		break;
		case "three" : System.out.println("selected three");
		break;
		default : System.out.println("option not available");
		}

	}

}
