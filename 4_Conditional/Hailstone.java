/** Hailstone:
 */
public class Hailstone {
    public static void main(String[] args) {
        System.out.println("*************************");
        System.out.println("    HAILSTONE PROGRAM    ");
        printHailstoneMaxMin( 7, 5 );
        printHailstoneMaxMin( 745, 150 );
    }

    public static void printHailstoneMaxMin(int value, int length ) {
        int min = value;
        int max = value;

        System.out.println("Sequence:");
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
            System.out.println("[*] "+value);
        }
        System.out.println("Max : " + max);
        System.out.println("Max : " + min);
    }

    public static int evenRule(int n) {
        return n/2;
    }

    public static int oddRule(int n) { 
        return 3 * n + 1;
    }
}
