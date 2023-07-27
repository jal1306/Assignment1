//4	 Write a program to print all Prime numbers between 1 to n. n should be takens as //varargs From user.

import java.util.*;
public class Qus4 {

	public static void main(String[] args) 
	{
		int i, number, count; 
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
		System.out.print("Prime Numbers are : ");	
		for(number = 1; number <= n; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}
	}
}
