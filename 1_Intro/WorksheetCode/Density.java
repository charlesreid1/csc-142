/*
 * Density
 *
 * This program prints out the density of various substances at room temperature.
 *
 * 1. Assign values of densities
 * 2. Print the values of densities
 *
 */
public class Density {
    public static void main(String[] args) { 

        double density_methanol = 0.792;  // g/cm3
        double density_ethanol = 0.789;   // g/cm3
        double density_water = 1.00;      // g/cm3
        double density_propene = 1.81E-3; // g/cm3
        double density_hexane = 0.655;    // g/cm3

        System.out.println("********************");
        System.out.println("CHEMICAL PROPERTIES");
        System.out.println("********************");
        System.out.println("\nDENSITY:\n");
        System.out.println("Methanol: "+density_methanol+" g/cm3");
        System.out.println("Ethanol: "+density_ethanol+" g/cm3");
        System.out.println("Water: "+density_water+" g/cm3");
        System.out.println("Propene: "+density_propene+" g/cm3");
        System.out.println("Hexane: "+density_hexane+" g/cm3");
    }
}
