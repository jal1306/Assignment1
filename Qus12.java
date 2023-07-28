import java.util.Scanner;

public class Qus12
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String newstring = scanner.nextLine();

        String replacedString = replaceChars(newstring);
        System.out.println("Original String: " + newstring);
        System.out.println("Replaced String: " + replacedString);
    }

    public static String replaceChars(String newstring) {
        newstring = newstring.replace('a', 'b').replace('p', 'q').replace('z', '.');
        return newstring;
    }
}