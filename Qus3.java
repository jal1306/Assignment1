//3	Check the number is armstrong or not.

import java.util.*;
public class Qus3
{
    public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

		int originalNumber = number;
        int numDigits = 0;
        int sum = 0;
        while (number > 0) 
		{
            numDigits++;
            number /= 10;
        }
        number = originalNumber;
        while (number > 0) 
		{
            int digit = number % 10;
            int powerOfDigit = 1;
            for (int i = 0; i < numDigits; i++) 
			{
                powerOfDigit *= digit;
            }
            sum += powerOfDigit;
            number /= 10;
        }
        if (originalNumber == sum) 
		{
            System.out.println(originalNumber + " is an Armstrong number.");
        } 
		else 
		{
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}