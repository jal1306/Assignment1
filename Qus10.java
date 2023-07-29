// 10 Write a Java Program to Check if two strings are anagrams of each other. 

import java.util.*;
class Qus10 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        if (str1.length() != str2.length())
		{
            System.out.println("The strings are not anagrams.");
            return;
        }
        int[] charCount = new int[256];
        for (int i = 0; i < str1.length(); i++) 
		{
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }
        for (int count : charCount) 
		{
            if (count != 0) 
			{
                System.out.println("The strings are not anagrams.");
                return;
            }
        }
        System.out.println("The strings are anagrams.");
    }
}