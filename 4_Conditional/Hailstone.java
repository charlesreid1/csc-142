/** Hailstone Program:
 *
 * This program generates a hailstone sequence of integers
 * (the formula for the next integer depends on 
 * whether the step we're on is even or odd.)
 * and prints them.
 *
 * See oddRule() and evenRule() for rules.
 *
 */
public class Hailstone {
    public static void main(String[] args) {
        System.out.println("*************************");
        System.out.println("    HAILSTONE PROGRAM    ");
        printHailstone( 7, 5 );
        printHailstone( 745, 150 );
    }

    public static void printHailstone(int value, int length ) {
        System.out.printf("Hailstone sequence starting at %d and continuing for %d digits:\n",value,length);

        for( int i = 1; i <= length - 1; i++ ) { 

            if(value%2 == 0) {
                value = evenRule(value);
            } else {
                value = oddRule(value);
            }

            System.out.print(value);

            if( i!=(length-1) ) {
                // If we aren't on the last loop, print a ,
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    /** This is the rule for the next integer in the hailstone sequence
     * if we are on an even step.
     */
    public static int evenRule(int n) {
        return n/2;
    }

    /** This is the rule for the next integer in the hailstone sequence
     * if we are on an odd step.
     */
    public static int oddRule(int n) { 
        return 3 * n + 1;
    }
}

