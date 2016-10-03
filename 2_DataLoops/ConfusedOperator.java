/**
 * Confused Operator:
 *
 * A program to show that operators are ambiguous - 
 * a plus sign between 2 and 3 means differnet things in different contexts.
 */
public class ConfusedOperator {
    public static void main(String[] args) {
        System.out.println( 2 + 3 + "hello" );
        System.out.println( "hello" + 2 + 3 );
    }
}
