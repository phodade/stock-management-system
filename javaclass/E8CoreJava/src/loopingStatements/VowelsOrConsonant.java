package loopingStatements;

public class VowelsOrConsonant {
    public static void main(String[] args) {
        char ch = 'A';

        // Alphabet check
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            // Vowel check
            if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e'
                    || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
                    || ch == 'U' || ch == 'u') 
            {
                System.out.println(ch + " is a vowel");
            } 
            else
            {
                System.out.println(ch + " is a consonant");
            }
        }
        // Digit check
        else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit");
        }
        // Special character
        else {
            System.out.println(ch + " is a special character");
        }
    }
}
