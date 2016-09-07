public class CaesarEncryption {
    public static void main(String[] args) {

        String message = "gaulisdividedintothreeparts";

        message = message.toUpperCase();
        int key = 12; // zero-indexed
        for( int i = 0; i < message.length(); i++ ) {
            char c, c2;
            int ix, ix2;

            c = message.charAt(i);
            ix = (c - 'A');
            ix2 = (ix + key)%26; // Compute shift
            c2 = (char)('A' + ix2);

            System.out.print(c2);
        }
    }
}
