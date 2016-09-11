/** Equality:
 * This class illustrates some weird behavior
 * when checking if things are equal in Java.
 */
public class Equality {
    public static void main(String[] args) { 
        compareStrings();
        compareDoubles();
    }

    public static void compareStrings() {
        String a, b;
        a = "Darth Vader";
        b = new String("Darth Vader");
        System.out.println("Comparing the following strings:");
        System.out.println("a=\"" + a + "\"");
        System.out.println("b=\"" + b + "\"");
        System.out.println("a==b: "+(a==b));
        System.out.println("a.equals(b): "+(a.equals(b)));

        System.out.println();
    }

    public static void compareDoubles() {
        double a, b; 
        a = (4./5.) - (3./5.);
        b = (1./5.);
        System.out.println("Comparing the following doubles:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("a==b: " + (a==b) );
        System.out.println("(a-b) < 0.0001: " + ((a-b)<0.0001) );

        System.out.println();
    }
}
