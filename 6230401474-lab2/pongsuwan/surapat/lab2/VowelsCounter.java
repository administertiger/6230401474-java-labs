package pongsuwan.surapatlab2 ;

public class VowelsCounter {
    public static void main(String[] args) {

        String word = args[0].toLowerCase() ;
        int vowels = 0 ;

        for (int i=0; i<word.length(); i++ ) {
            char ch = word.charAt(i) ;
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels ;
            }
        }
        System.out.println("Total number of towels is " + vowels) ;
    }
}