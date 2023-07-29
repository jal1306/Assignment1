// 11. Write a Java program that counts the number of unique characters of two given strings.

import java.util.Scanner;
class Qus11
{
	public static int countUniqueCharacters(String input) 
	{
		boolean[] isItThere = new boolean[Character.MAX_VALUE];
		for (int i = 0; i < input.length(); i++) 
		{
			isItThere[input.charAt(i)] = true;
		}

		int count = 0;
		for (int i = 0; i < isItThere.length; i++) 
		{
			if (isItThere[i] == true)
			{
				count++;
			}
		}
    return count;
	}

    public static void main(String[] args) 
	{
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String:- ");
		String str1 = sc.nextLine();
		System.out.println("Enter Second String:- ");
		String str2 = sc.nextLine();
		String str3 = str1 + str2;
		System.out.println("concanted string:- "+str3);
		
		char arr[] = str3.toCharArray();
		char temp;
		int i = 0;
		while (i < arr.length) 
		{
			int j = i + 1;
			while (j < arr.length) 
			{
				if (arr[j] < arr[i]) 
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j += 1;
			}
			i += 1;
		}
		System.out.println(arr);	
		cnt = countUniqueCharacters(str3);
		System.out.println(cnt);
    }
}