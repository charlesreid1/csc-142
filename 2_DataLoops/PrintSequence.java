/**
 * PrintSequence:
 * Prints the first 20 numbers of the sequence 2^n.
 */
public class PrintSequence {
    public static void main(String[] args) { 
        int N = 20;
        for( int i = 1; i <= N; i++ ) {
            double square = Math.pow(2,i);
            System.out.println( (int)(square) );
        }
    }
}
