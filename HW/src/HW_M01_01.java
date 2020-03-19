public class HW_M01_01 {
    public static void main(String[] args) {
        double a = 16;
        double b = 145;
        double c = 9;
        double x1;
        double x2;
        x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
