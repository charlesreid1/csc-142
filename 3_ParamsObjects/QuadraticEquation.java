/**
 * QuadraticEquation:
 * Solve the quadratic equation for a given polynomial
 * ax^2 + bx + c = 0 
 * and print the solution.
 */
public class QuadraticEquation {

    public static void main(String[] args) {
        printIntro();
        solveQuadraticEquation(2.0,8.0,7.0);
        solveQuadraticEquation(1.0,2.0,1.0);
    }

    /** Print a header */
    public static void printIntro() {
        System.out.println("*****************************");
        System.out.println("Quadratic Equation Solver");
        System.out.println("*****************************");
        System.out.println();
    }

    /** Print the solution x to the polynomial ax^2 + bx + c */
    public static void solveQuadraticEquation(double a, double b, double c) {
        System.out.println("Solving quadratic equation for:");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);

        double det = Math.pow(b,2) - 4*a*c;
        if(det < 0) {
            System.out.println("Negative determinant: No real roots");
            return;
            // NOTE: We can do this instead of raising an exception, 
            // since the user calling solveQuadraticEquation is not expecting 
            // a solution to be returned.
            //
            // If the user depended on a number being returned, 
            // we would have to raise an exception.
        } 

        double x1, x2;
        x1 = (  - b + Math.sqrt( Math.pow(b,2) - 4*a*c )  )/(2*a);
        x2 = (  - b - Math.sqrt( Math.pow(b,2) - 4*a*c )  )/(2*a);

        System.out.println("Solutions found!");
        System.out.printf("x1 = %4f \n",x1);
        System.out.printf("x2 = %4f \n",x2);
    }
}
