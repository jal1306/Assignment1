//5	Write a Java Program to count the occurrence of the given character in a string?


import java.util.*;
public class Qus5 
{
	public static void main(String args[])
	{
        String str = "Jal Majithiya";
        char ch = 'i';
        int cnt = 0;
         
        for ( int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                cnt++;
        }
        System.out.println("Occurrences of " + ch + " are " + cnt);
	}	
}