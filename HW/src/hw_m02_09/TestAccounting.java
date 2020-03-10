package hw_m02_09;

public class TestAccounting {
    public static void main(String[] args) {
        double workingHours = 2;
        double perHourPayment = 60;
        System.out.println("Result of calculated payment for " + workingHours + " and " + perHourPayment + " is : "+ Accounting.pay(workingHours, perHourPayment));
    }
}
