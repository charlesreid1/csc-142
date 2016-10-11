/** Hailstone Min/Max Program:
 *
 * This program generates a hailstone sequence of integers
 * (the formula for the next integer depends on 
 * whether the step we're on is even or odd.)
 *
 * See oddRule() and evenRule() for rules.
 *
 */
public class HailstoneMinMax {
    public static void main(String[] args) {
        System.out.println("*********************************");
        System.out.println("    HAILSTONE MIN/MAX PROGRAM    ");
        printHailstoneMaxMin( 7, 5 );
        printHailstoneMaxMin( 745, 150 );
    }

    public static void printHailstoneMaxMin(int value, int length ) {
        int min = value;
        int max = value;

        for( int i = 1; i <= length- 1; i++ ) { 

            if(value%2 == 0) {
                value = evenRule(value);
            } else {
                value = oddRule(value);
            }
            if( value > max ) {
                max = value;
            } else if (value < min ) {
                min = value;
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Max : " + min);
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

