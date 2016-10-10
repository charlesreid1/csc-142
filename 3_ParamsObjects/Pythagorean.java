public class Pythagorean {
    public static void main(String[] args) {
        double a = 8.0;
        double b = 9.0;
        double c = findHypotenuse(a, b);
        System.out.printf("Hypotensue length = %.4f",c);
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a*a + b*b);
    }
}


