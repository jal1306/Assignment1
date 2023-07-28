//5	Write a Java Program to count the occurrence of the given character in a string?


import java.util.*;
public class Qus5 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:- ");
        String str = sc.nextLine();
		System.out.println("Enter Character to find occurrence:- ");
        char ch = sc.next().charAt(0);
        //char ch = 'i';
        int cnt = 0;
         
        for ( int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                cnt++;
        }
        System.out.println("Occurrences of " + ch + " are " + cnt);
	}	
}