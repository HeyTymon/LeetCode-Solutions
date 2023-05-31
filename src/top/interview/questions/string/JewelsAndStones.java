package top.interview.questions.string;

import java.util.Arrays;
import java.util.List;

public class JewelsAndStones {

    public static int numJewelsInStonesFaster(String jewels, String stones) {
        int jewelsCounter = 0;

        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if(stones.charAt(j) == jewels.charAt(i)) jewelsCounter++;
            }
        }

        return jewelsCounter;
    }

    public static int numJewelsInStones(String jewels, String stones) {

        List<String> jewelsTypes = Arrays.stream(jewels.split("")).toList();

        String[] separatedStones = stones.split("");

        int jewelsCounter = 0;

        for (String s : separatedStones) {
            if (jewelsTypes.contains(s)) jewelsCounter++;
        }

        return jewelsCounter;
    }


    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
}
