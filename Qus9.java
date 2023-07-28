// 9 Take input in form of Numbers for Day, month and year and covert it to localDate and also take whole date as String and convert  	it to LocalDate.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class Qus9
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        LocalDate no = LocalDate.of(year, month, day);
        System.out.println("Date from numbers: " + no);
        sc.nextLine(); 
        System.out.print("Enter date in this format i.e. 2023-07-27: ");
        String dateString = sc.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate string = LocalDate.parse(dateString, format);
        System.out.println("Date from string: " + string);
    }
}