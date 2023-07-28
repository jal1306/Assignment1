// 10 Write a Java Program to Check if two strings are anagrams of each other. 


import java.util.*;

class Qus10 
{
    public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = scanner.nextLine();
		System.out.print("Enter another string: ");
        String str2 = scanner.nextLine();
    
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

    if(str1.length() == str2.length()) 
	{

      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else {
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
    }
    else {
      System.out.println(str1 + " and " + str2 + " are not anagram.");
    }
  }
}