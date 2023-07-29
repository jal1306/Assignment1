// 6 Write a Java Program to reverse a string without using any inbuilt function.

import java.util.*;
public class Qus6 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }
    public static String reverseString(String input) 
	{
        char[] chars = input.toCharArray();
        int left = 0;
        int right = input.length() - 1;
        while (left < right)
		{
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
	}
}