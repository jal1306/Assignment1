//7	"Write a Program that take input as your Birthdate and return us how many years, months , days, hours, minitus, seconds are pending for your birthdate.
//	(Can have birthdate in a leap year)"


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Qus7
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your BirthYear:- ");
        int birthYear = sc.nextInt();
		System.out.println("Enter your BirthMonth:- ");
        int birthMonth = sc.nextInt();
		System.out.println("Enter your BirthDay:- ");
        int birthDay = sc.nextInt();

        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        if (birthDate.isBefore(currentDate)) {
            System.out.println("Your birthdate has already passed.");
            return;
        }

        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime nextBirthDateTime = LocalDateTime.of(birthDate, LocalTime.MIDNIGHT);

        Period period = Period.between(currentDate, birthDate);
        long hoursRemaining = currentDateTime.until(nextBirthDateTime, java.time.temporal.ChronoUnit.HOURS);
        long minutesRemaining = currentDateTime.until(nextBirthDateTime, java.time.temporal.ChronoUnit.MINUTES);
        long secondsRemaining = currentDateTime.until(nextBirthDateTime, java.time.temporal.ChronoUnit.SECONDS);

        System.out.println("Time remaining until your birthdate:");
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
        System.out.println("Hours: " + hoursRemaining);
        System.out.println("Minutes: " + minutesRemaining);
        System.out.println("Seconds: " + secondsRemaining);
    }
}