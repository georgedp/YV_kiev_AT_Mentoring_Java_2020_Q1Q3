import java.util.Scanner;

public class HW_M02_04 {
//        4. Write a Java program which converts any number from 0 to 10000 into its text representation. For example, if a number
//        is 1234 then your application should print one thousand two hundred thirty-four, or if a number is 49 then it should print
//        forty-nine, or if a number is 13 then it should print thirteen. Use your program to print all numbers in text starting from 10
//        to 150. In addition please print all numbers in text from 9980 to 10000.

    public static String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    public static String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convert(int n) {

        if (n <= -1 || n > 10000) {
            return "Please, tray to enter a number from 0 to 10000 in next time";
        } else if (n < 20) {
            return units[n];
        } else if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        } else if (n < 1000) {
            return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        } else if (n < 100000) {
            return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("#1 Enter a number from 0 to 10000: ");
        int n = input.nextInt();

        System.out.println(convert(n));

        int i;
        System.out.println("#2 all numbers in text starting from 10 to 150");
        for (i = 10; i <= 150; i++) {
            System.out.print(convert(i) + ", ");
        }
        System.out.println("");

//        i = 0;
        System.out.println("#3 In addition printing all numbers in text from 9980 to 10000");
        for (i = 9800; i <= 10000; i++) {
            System.out.print(convert(i) + ", ");
        }
        System.out.println("");
    }
}