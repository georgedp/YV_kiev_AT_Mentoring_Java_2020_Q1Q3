public class HW_M02_01 {
    public static void main(String[] args) {
//      1. Create a Java program which prints all prime numbers in a defined range. The range should be defined as a two long
//        variables, for example:
//        long from = 0;
//        long to = 50000;

        long startOfRange = 0;
        long i = startOfRange;
        long endOfRange = 13;

        String printPrimeNumbers = "";
        long number = 0;

        for (i = 1; i <= endOfRange; i++) {
            long counter = 0;
            for (number = i; number >= 1; number++) {
                if (i % number == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                printPrimeNumbers = printPrimeNumbers + i + " ";
            }
        }

        System.out.println("This is prime numbers from " + startOfRange + " to " + endOfRange + " are :");
        System.out.println(printPrimeNumbers);
    }
}
