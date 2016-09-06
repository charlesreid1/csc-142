/**
 * Scope:
 * Illustrates the concept of scope.
 */
public class Scope {
    public static void main(String[] args) { 

        // This message variable will be out of scope 
        // when the System.out.println() call happens
        String message = "This message will not be used.";
        printMessage();

        // This count variable will be out of scope
        // when the System.out.println() call happens
        int count = 100;
        printCount();

        double pi = 3.14159;
        setPi();
        System.out.println("The value of pi is: "+pi);
    }

    public static void printMessage() { 
        String message = "This is the message that gets printed.";
        System.out.println(message);
    }

    public static void printCount() { 
        int count = 0;
        System.out.println("The value of count is: "+count);
    }

    public static void setPi() {
        // This (incorrect) variable pi is declared in a different scope 
        // from the other (correct) variable pi.
        // This variable will be destroyed when setPi() is done.
        double pi = 4.0;
    }
}
