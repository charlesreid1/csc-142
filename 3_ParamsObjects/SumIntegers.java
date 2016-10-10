/**
 * Sum of Integers:
 *
 * Compute the sum of the first n integers
 * using three different methods.
 */
public class SumIntegers {
    public static void main(String[] args) {

        int n = 100;
        int sum;

        System.out.println("\n\nSum of first N integers:");
        System.out.println("------------------------\n\n");

        System.out.println("\nPrint out the rote method (1 + 2 + 3 + ...)");
        printRoteSum(n);
        System.out.println();
        System.out.println();

        System.out.println("\nSum Formula");
        sum = findFormulaSum(n);
        System.out.println();
        System.out.println();

    }

    public static void printRoteSum(int n) {
        // Left as an exercise for the reader
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
            System.out.print(i);
            if(i!=n) {
                System.out.print("+");
            }
        }
        System.out.print(" = ");
        System.out.println(sum);

    }

    public static int findFormulaSum(int n) {
        int sum = n*(n+1)/2;
        System.out.println("n*(n+1)/2 = " + n + "*(" + (n+1) + ")/2 = " + sum);
        return sum;
    }
}
