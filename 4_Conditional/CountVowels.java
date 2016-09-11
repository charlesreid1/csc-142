public class CountVowels {
    public static void main(String[] args) { 
        String sentence = "Grumpy wizards make toxic brew for the Evil Queen and Jack.";
        int count = countVowels(sentence);
        System.out.println( "\"" + sentence + "\" has " + count + " vowels.");
    }

    public static int countVowels( String text ) { 
        int vowels = 0;
        for( int i=0; i<text.length(); i++ ) {
            char c = text.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
              vowels++;
            }
        }
        return vowels;
    }
}
