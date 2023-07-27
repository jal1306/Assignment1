//3	Check the number is armstrong or not.

import java.util.*;
public class Qus3
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three digit number:- ");
		int num = sc.nextInt();
        int  originalnum, remainder, result = 0;
        originalnum = num;
        while (originalnum != 0)
        {
            remainder = originalnum % 10;
            result += Math.pow(remainder, 3);
            originalnum /= 10;
        }
        if(result == num)
		{
            System.out.println(num + " is an Armstrong number.");
        }
		else
		{
            System.out.println(num + " is not an Armstrong number.");
		}
	}
}	