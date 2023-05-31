package problems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//NOT FINISHED
public class SortCharacterByFrequency {
    public String frequencySort(String s) {

        String[] strings = s.split("");
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (!stringIntegerMap.containsKey(strings[i])) {
                stringIntegerMap.put(strings[i], 1);
            } else {
                stringIntegerMap.put(strings[i], stringIntegerMap.get(strings[i]) + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringIntegerMap.size(); i++) {
            int maxFrequency = Collections.max(stringIntegerMap.entrySet(),Map.Entry.comparingByValue()).getValue();

        }

        return sb.toString();
    }
}
