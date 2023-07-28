// 6 Write a Java Program to reverse a string without using any inbuilt function.

import java.util.*;
public class Qus6 
{
    public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

		for(int i=0;i<=str.length()-1;i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println("");
		
		for(int i = str.length() - 1; i >= 0; --i)
		{
			System.out.print(str.charAt(i)); 
		}
	}
}

