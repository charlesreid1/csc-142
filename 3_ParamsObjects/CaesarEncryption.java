/**
 * Caesar Encryption:
 * This program encrypts a message using the Caesar cipher,
 * which shifts each letter by a fixed amount.
 */
public class CaesarEncryption {
    public static void main(String[] args) {

        int key = 12; // zero-indexed
        String msg = "gaulisdividedintothreeparts";
        String cipher_msg = encryptCaesarCipher(msg, key);
        System.out.println(cipher_msg);
        // key of 12: SMGXUEPUHUPQPUZFAFTDQQBMDFE

        int key2 = 3;
        String cipher_msg2 = "JDXOLVGLYLGHGLQWRWKUHHSDUWV";
        String msg2 = decryptCaesarCipher(cipher_msg2, key);
        System.out.println(msg2);

    }

    public static String encryptCaesarCipher( String message, int key ) { 

        message = message.toUpperCase();

        // Loop over each character in the string
        String cipher_message = "";
        for( int i = 0; i < message.length(); i++ ) {
            char c, c2;
            int ix, ix2;

            c = message.charAt(i);
            ix = (c - 'A');
            ix2 = (ix + key)%26; // Compute shift
            c2 = (char)('A' + ix2);

            cipher_message += c2;
        }
        return cipher_message;
    }


    public static String decryptCaesarCipher( String cipher_message, int key ) { 
        
        cipher_message = cipher_message.toLowerCase();

        // Loop over each character in the string
        String message = "";
        for( int j = 0; j < message.length(); j++ ) {
            char c, c2;
            int ix, ix2;

            c = cipher_message.charAt(j);
            ix = (c - 'a');
            ix2 = (ix - key)%26;
            c2 = (char)('a' + ix2);

            message += c2;
        }
        return message;

    }
}
