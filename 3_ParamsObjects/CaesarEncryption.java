public class CaesarEncryption {
    public static void main(String[] args) {
        // char shift is the key
        for(char c = 'A'; c <='Z'; c++) {
            System.out.println( (char)(c - 12) );
        }
    }
}
