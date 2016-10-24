// BMI Class
//
// This class provides you with a template to start with
// for an in-class exercise from Chapter 4.

import java.util.*;  // so we can use Scanner

public class BMI {
    public static void main(String[] args) {
        introduction();
        Scanner console = new Scanner(System.in);
        
        
        // Fill in the rest of this method
        // Using the person() and report() methods
        
        
    }
    
    // prints a welcome message explaining the program
    public static void introduction() {
        System.out.println("This program reads data for two people and");
        System.out.println("computes their body mass index (BMI).");
        System.out.println();
    }
    
    // reads information for one person, computes their BMI, and returns it
    public static double person(Scanner console) {
        System.out.println("Enter next person's information:");
        System.out.print("height (in inches)? ");

        // Finish this method!
        
        System.out.print("weight (in pounds)? ");

        // Finish this method!

    }
    
    // Computes/returns a person's BMI based on their height and weight.
    public static double bmi(double height, double weight) {
        
    	// Program the formula:
    	// 
    	//             703 * weight 
    	// BMI   =    ----------------
    	//               height^2

    	
    }

    // Outputs information about a person's BMI and weight status.
    public static void report(int number, double bmi) {

    	// Finish this method!
    	
    	if (bmi < 18.5) {
            // Fill this in 
    		
        } else if (bmi < 25) {
            // Fill this in
        	
        } else if (bmi < 30) {
            // Fill this in
        	
        } else {
            // Fill this in
        	
        }
    }
}
