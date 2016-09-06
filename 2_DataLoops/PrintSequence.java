/**
 * Sequence:
 * Prints the first 10 numbers of a simple sequence.
 *
 * The sequence is given by,
 * 
 *      2, 4, 8, 16, 32...
 *
 *  or,
 *
 *      2^n
 */
import static java.lang.Math.*;

public class PrintSequence {
    public static void main(String[] args) { 
        int N = 10;
        for( int i = 1; i <= N; i++ ) {
            double square = Math.pow(2,i);

            //System.out.println( square );
            System.out.println( (int)(square) );
        }
    }
}
