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
        double b = 55;
        int Niter = 10;
        approxSquareRoot(b,Niter);
    }

    /** Approximate the square root of b using Newton's Method */
    public static double approxSquareRoot(double b, int Niterations) {

        // No imaginary numbers!
        if(b < 0) {
            return -666;
        }

        System.out.println("Approximating square root of " + b);

        // Iterate a fixed number of times 
        double truth = Math.sqrt(b);
        double x_i = b;
        System.out.print("Iter\tApprox\tTruth\n");

        // approximate the value of the square root using Newton's method
        for( int i=1; i <= Niterations; i++ ) {
            x_i -= ( Math.pow(x_i,2) - b )/(2 * x_i );
            System.out.printf("%d\t%6f\t%6f\n",i,x_i,truth);
        }
        return x_i;
    }
}
