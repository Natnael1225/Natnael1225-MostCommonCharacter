import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        if(str == null || str.isEmpty()){
           return ' ';  
        }
        Map<Character, Integer> charCountMap = new HashMap<>();
        for(char ch : str.toCharArray()){
            charCountMap.put(ch, charCountMap.getOrDefault(ch,0) + 1);
        }

        char mostCommonChar = ' ';
        int maxCount = 0;

        for(java.util.Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();
                mostCommonChar = entry.getKey();
            }
        }
            return mostCommonChar;
        
    }
}
