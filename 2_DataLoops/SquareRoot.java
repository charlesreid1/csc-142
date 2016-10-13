import java.util.*;
/**
 * SquareRoot:
 * Implement Newton's Method to obtain an approximation 
 * for the square root of b.
 *
 * The approximation of the square root of b is obtained through
 * the iterative approximation:
 *
 *      x_{i+1} = x_{i} + ( x_{i}^2 - b )/(2 x_i)
 *
 */
public class SquareRoot {

    public static void main(String[] args) { 
        double b = 2;
        for(int i=1; i<100; i*=2) {
            double initial_guess = i*b;
            int Niter = 10;
            approxSquareRoot(b,initial_guess,Niter);
            System.out.println();
        }
    }

    /** Approximate the square root of b using Newton's Method */
    public static double approxSquareRoot(double b, double initial_guess, int Niterations ) {

        // No imaginary numbers!
        if(b < 0) {
            throw new IllegalArgumentException("ERROR: You cannot compute the square root of an imaginary number with this method.");
        }

        System.out.println("Approximating square root of " + b);

        // Iterate a fixed number of times 
        double truth = Math.sqrt(b);
        double x_i = initial_guess;
        System.out.print("Iteration\tApproximation\t\tTrue Value\n");

        System.out.printf("%2d\t\t%.10f\t\t%.10f\n",0,initial_guess,truth);

        // approximate the value of the square root using Newton's method
        for( int i=1; i <= Niterations; i++ ) {
            x_i -= ( Math.pow(x_i,2) - b )/(2 * x_i );
            System.out.printf("%2d\t\t%.10f\t\t%.10f\n",i,x_i,truth);
        }
        return x_i;
    }
}
