import java.util.Scanner;

public class HW_M02_03 {
    public static void main(String[] args) {
//        3. Write a Java program which prints what is Chinese zodiac for a defined year
//        (https://en.wikipedia.org/wiki/Chinese_zodiac). For example, it should print A Yellow Pig year for 2019 or A Blue Goat year
//        for 2015. Please make sure that your program works correctly for any year starting from year 0 a.d. inclusive.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        String answer = "";
        if (year <= -1) {
            System.out.println("Wrong year num.");
            System.out.println("Zodiac could be calculated from year 0 a.d. inclusive");
        } else {
            switch (year % 5) {
                case 0:
                    answer = "A Blue ";
                    break;
                case 1:
                    answer = "A Black ";
                    break;
                case 2:
                    answer = "A Green ";
                    break;
                case 3:
                    answer = "A Red ";
                    break;
                case 4:
                    answer = "A Yellow ";
                    break;
                default:
                    answer = "A Wrong year num format ";
                    break;
            }
            switch (year % 12) {
                case 0:
                    answer += "Monkey";
                    break;
                case 1:
                    answer += "Rooster";
                    break;
                case 2:
                    answer += "Dog";
                    break;
                case 3:
                    answer += "Pig";
                    break;
                case 4:
                    answer += "Rat";
                    break;
                case 5:
                    answer += "Ox";
                    break;
                case 6:
                    answer += "Tiger";
                    break;
                case 7:
                    answer += "Rabbit";
                    break;
                case 8:
                    answer += "Dragon";
                    break;
                case 9:
                    answer += "Snake";
                    break;
                case 10:
                    answer += "Horse";
                    break;
                case 11:
                    answer += "Goat";
                    break;
            }
            answer += " year";
            System.out.println(answer);

        }
    }
}