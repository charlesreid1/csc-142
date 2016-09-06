import java.io.*;

public class QuadraticEquation {

    public static void main(String[] args) {
        printIntro();
        solveQuadraticEquation(1,4,4);
        solveQuadraticEquation(1,2,1);
    }

    public static void printIntro() {
        System.out.println("*****************************");
        System.out.println("Quadratic Equation Solver");
        System.out.println("*****************************");
        System.out.println();
    }

    public static void solveQuadraticEquation(double a, double b, double c) {
        System.out.println("Solving quadratic equation for:");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);

        double det = Math.pow(b,2) - 4*a*c;
        if(det < 0) {
            System.out.println("Negative determinant: No real roots");
            return;
        } 

        double x1, x2;
        x1 = (  - b + Math.sqrt( Math.pow(b,2) - 4*a*c )  )/2;
        x2 = (  - b - Math.sqrt( Math.pow(b,2) - 4*a*c )  )/2;

        System.out.println("Solutions found!");
        System.out.printf("x1 = %4f \n",x1);
        System.out.printf("x2 = %4f \n",x2);
    }
}
