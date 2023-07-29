// 12 Write a JAVA program to change every letter in a given string with the letter following it in the alphabet(ie. a becomes b, p becomes q, z becomes.)

import java.util.Scanner;
public class Qus12
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        String str2 = "";
        for (int i = 0; i < str1.length(); i++) 
		{
            char char1 = str1.charAt(i);
            char char2 = (char) (char1 + 1);
            if (char1 >= 'a' && char1 <= 'z') 
			{
                if (char2 > 'z') 
				{
                    char2 = 'a';
                }
            } 
			else if (char1 >= 'A' && char1 <= 'Z') 
			{
                if (char2 > 'Z') 
				{
                    char2 = 'A';
                }
            }
            str2 += char2;
        }
        System.out.println("Encrypted string: " + str2);
    }
}