// 15 Write a JAVA program to sort characters (numbers and punctuation symbols are not included) in a string. 

import java.util.Arrays;

import java.util.*;
class Qus15 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
		char temp;
		int i = 0;
		while (i < arr.length) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[j] < arr[i]) {
				
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j += 1;
			}
			i += 1;
		}
		System.out.println(arr);
	}
}