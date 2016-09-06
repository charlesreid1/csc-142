/**
 * PrintSequence:
 * Prints the first 20 numbers of a simple sequence.
 *
 * The sequence is given by,
 * 
 *      2, 4, 8, 16, 32...
 *
 *  or,
 *
 *      2^n
 */
public class PrintSequence {
    public static void main(String[] args) { 
        int N = 20;
        for( int i = 1; i <= N; i++ ) {
            double square = Math.pow(2,i);

            //System.out.println( square );
            System.out.println( (int)(square) );
        }
    }
}
