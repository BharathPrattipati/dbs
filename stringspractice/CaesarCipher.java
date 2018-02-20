package com.git.practice;

import java.util.Scanner;

public class CaesarCipher {

	static char[] caesarCipher(String s, int k,int n) {
        
 	   int numChars = n;
         char[] inputString = s.toCharArray();
         int rotateValue = k;
         for(int i = 0;i<numChars;i++){
         
             char currentChar = inputString[i];
             if(Character.isLetter(currentChar)){
                 char rotatedChar = (char)((int)currentChar+rotateValue%26);
                 if(Character.isUpperCase(currentChar)){
                     inputString[i] = ((int)rotatedChar<=90)?rotatedChar:(char)((rotatedChar-(int)'Z')+(int)'A'-1);
                 }else{
                     inputString[i] =((int)rotatedChar<=122)?rotatedChar:(char)((rotatedChar-(int)'z')+(int)'a'-1);
                 } 
             }
         }
        
 	return inputString;
 	    }

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         String s = in.next();
         int k = in.nextInt();
         char result[] = caesarCipher(s, k,n);
         System.out.println(result);
         in.close();
     }

}
