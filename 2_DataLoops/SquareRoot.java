public class SquareRoot {
    public static void main(String[] args) { 
        double n = 55;
        double sqrtn = approxSquareRoot(n);
        System.out.printf("The square root of %d is approximately %4f",n,sqrtn);
    }

    // approximate the square root
    public static double approxSquareRoot(double quantity) { 
        // no imaginary numbers!
        if(quantity < 0) {
            break;
        }

        // iterate a fixed number of times 
        int Niterations = 6;
        double value = quantity;
        for( int i=0; i < Niterations; i++ ) {
            // approximate the value of the square root using Newton's method
            value *= (quantity/2);
        }
    }
}

