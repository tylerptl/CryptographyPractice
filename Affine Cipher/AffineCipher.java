import java.math.BigInteger;

public class AffineCipher {
    // Keys must be coprime
    private static int firstKey = 5;
    private static int secondKey = 19;
    private static int module = 26;

    static String encrypt(String text){
        StringBuilder sb = new StringBuilder();
        for(char ch : text.toCharArray()){
            char character = ch;
            if(Character.isLetter(ch)){
                character = (char)((firstKey * (ch - 'a') + secondKey) % module + 'a');
            }
            sb.append(character);
        }
        return sb.toString();
    }

    static String decrypt(String text){
        StringBuilder sb = new StringBuilder();

        //Find modular inverse for first key
        BigInteger inverse = BigInteger.valueOf(firstKey).modInverse(BigInteger.valueOf(module));

        // perform decryption

        for(char ch : text.toCharArray()){
            char character = ch;
            if(Character.isLetter(character)){
                // Reverse encryption by replacing firstKey in encryption function with its inverse
                int decoded = inverse.intValue() * (character - 'a' - secondKey + module);
                character = (char) (decoded%module + 'a');
            }
            sb.append(character);
        }
        return sb.toString();
    }
}
