public class PrimeCheck {

    public static boolean isPrime(int p) {
        //first screen out some tricky and obvious ones: 
        if (p == 1 || p == 2) { 
            return true; // prime by definition
        } else if( p%2 == 0 ) {
            return false; // even
        } else {
            float n = 3;
            float r = p % n;
            while( r != 0 && n < Math.sqrt(p) ) {
                n += 2;
                r = p % n;
            }
            if( r != 0 ) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) { 
        System.out.println( isPrime(17) );
        System.out.println( isPrime( (int)(Math.pow(2,7)) - 1 ) );
        System.out.println( isPrime( (int)(Math.pow(2,8)) - 1 ) );
        System.out.println( isPrime( (int)(Math.pow(2,9)) - 1 ) );
        System.out.println( isPrime(2147483647) ); 
    }
}
