public class PrimeFencepost {
    public static void main(String[] args) {
        printPrimes(1789);
    }

    // Prints all prime numbers up to the given max.
    public static void printPrimes(int max) {
        if (max >= 2) {
            System.out.print("2");
            for (int i = 3; i <= max; i++) {
                if (countFactors(i) == 2) {
                    System.out.print(", " + i);
                }
            }
            System.out.println();
        }
    }
    
    // Returns how many factors the given number has.
    public static int countFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;   // i is a factor of number
            }
        }
        return count;
    }
}
