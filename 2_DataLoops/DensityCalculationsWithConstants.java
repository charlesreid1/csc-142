/**
 * Density Calculations With Constants:
 *
 * Illustrates the use of class constants by calculating the density
 * of various substancees at room temperature, using a constant
 * conversion factor.
 */
public class DensityCalculationsWithConstants {
    public static void main(String[] args) { 

        double density_methanol = 0.792;  // g/cm3
        double density_ethanol = 0.789;   // g/cm3
        double density_water = 1.00;      // g/cm3
        double density_propene = 1.81E-3; // g/cm3
        double density_hexane = 0.655;    // g/cm3

        // This defines the conversion factor as a constant
        public static double conversion final = 62.427961; // 1 g/cm3 = 62.42 lb/ft3

        System.out.println("********************");
        System.out.println("CHEMICAL PROPERTIES");
        System.out.println("********************");
        System.out.println();
        System.out.println("DENSITY:");
        System.out.println();
        System.out.println("Methanol: " + density_methanol * conversion + " lb/ft3");
        System.out.println("Ethanol: " + density_ethanol * conversion + " lb/ft3");
        System.out.println("Water: " + density_water * conversion + " lb/ft3");
        System.out.println("Propene: " + density_propene * conversion + " lb/ft3");
        System.out.println("Hexane: " + density_hexane * conversion + " lb/ft3");
    }
}

