public class SquareRoot {

    public static void main(String[] args) { 
        double n = 55;
        approxSquareRoot(n);
    }

    // function to approximate the square root using Newton's Method
    public static double approxSquareRoot(double quantity) { 
        // no imaginary numbers!
        if(quantity < 0) {
            break;
        }

        System.out.printf("Approximating square root of %2f \n",quantity);

        // iterate a fixed number of times 
        int Niterations = 6;
        double value = quantity;
        System.out.println("Iteration\tApproximation\n");
        for( int i=0; i < Niterations; i++ ) {
            // approximate the value of the square root using Newton's method
            value *= (quantity/2);
            System.out.printf("%d\t%6f\n",i,value);
        }
    }
}

