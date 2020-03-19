public class HW_M02_02 {
    public static void main(String[] args) {
//  2. Rewrite a quadratic equation solver with using if statements. It should print:
//  There is no solution – in case if discriminant is a negative number
//  There is only one root – in case if there only one root or a coefficient is equals to zero

        double a = 4;
        double b = 7;
        double c = 3;
        double x1;
        double x2;

        double discriminant = b * b - 4 * a * c;

        if (discriminant == 0 ) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println( "There is only one root: " + x1);
        } else if (discriminant < 0){
            System.out.println( "There is no solution – discriminant is a negative number");
        } else {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

    }
}
