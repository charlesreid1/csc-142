/*
 * Density
 *
 * This program prints out the density of various substances at room temperature,
 * after converting the units of density.
 *
 * 1. Assign values of densities
 * 2. Convert the units of density
 * 2. Print the values of densities
 *
 */
public class DensityCalculations {
    public static void main(String[] args) { 

        double density_methanol = 0.792;  // g/cm3
        double density_ethanol = 0.789;   // g/cm3
        double density_water = 1.00;      // g/cm3
        double density_propene = 1.81E-3; // g/cm3
        double density_hexane = 0.655;    // g/cm3

        double gcm3_to_lbft3 = 62.427961; // 1 g/cm3 = 62.42 lb/ft3

        System.out.println("********************");
        System.out.println("CHEMICAL PROPERTIES");
        System.out.println("********************");
        System.out.println();
        System.out.println("DENSITY:");
        System.out.println();
        System.out.println("Methanol: " + density_methanol * gcm3_to_lbft3 + " lb/ft3");
        System.out.println("Ethanol: " + density_ethanol * gcm3_to_lbft3 + " lb/ft3");
        System.out.println("Water: " + density_water * gcm3_to_lbft3 + " lb/ft3");
        System.out.println("Propene: " + density_propene * gcm3_to_lbft3 + " lb/ft3");
        System.out.println("Hexane: " + density_hexane * gcm3_to_lbft3 + " lb/ft3");
    }
}

