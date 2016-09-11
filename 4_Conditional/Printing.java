public class Printing { 
    public static void main(String[] args) { 
        System.out.println("Printing digits:");
        System.out.printf("%06d\n",100);
        System.out.printf("%6d\n", 100);

        System.out.println("Printing floats:");
        System.out.printf("%.4f\n",  0.000123456789);
        System.out.printf("%.04f\n", 0.000123456789);
        System.out.printf("%.4f\n",  125.1);
        System.out.printf("%.04f\n", 125.1);
        System.out.printf("%.02e\n", 0.000123456789);
        System.out.printf("%.04e\n", 0.000123456789);
    }
}
