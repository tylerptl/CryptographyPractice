import java.util.*;

public class CaesarCipher {
    int[] myArr = new int[26];
    Map<Character, Integer> map = new HashMap<>();
    char character;
    int count;

    PriorityQueue<Integer> p = new PriorityQueue<>(5);



    public static StringBuffer encrypt(String text, int shift){
        StringBuffer result = new StringBuffer();

        for(char c: text.toCharArray()){
            if(Character.isUpperCase(c)){
                char ch = (char)(((int)c + shift-65)%26 + 65);
                result.append(ch);

            }else{
                char ch = (char)(((int)c + shift-97)%26 + 97);
                result.append(ch);
            }
        }
        return result;
    }



    public void freqAnalysis(String text) {

        // Adds to Map and records occurrences
        for (int i = 0; i < text.length(); i++) {
            character = text.charAt(i);
            count++;

            Integer countForCharacter;

            if (map.containsKey(character)) {
                countForCharacter = map.get(character);
                countForCharacter++;
            } else {
                countForCharacter = 1;
            }

            map.put(character, countForCharacter);

        }
        decrypt(map, text);
    }

    private void decrypt(Map<Character, Integer> map, String text){

        int shift;
        for(int i : map.values()){
            p.add(i);
            if(p.size() > 5){
                p.poll();

            }
        }
        System.out.println("Highest Frequencies: " + p.toString());

        for(int n : p) {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == n) {
                    shift = (int) entry.getKey() - (int) 'e';
                    System.out.println("Shift : " + shift);
                    System.out.println(encrypt(text, 26 - shift).toString());
                }
            }

        }
    }
}
