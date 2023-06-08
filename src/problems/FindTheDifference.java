package problems;

import java.util.Arrays;

public class FindTheDifference {
    public static char findTheDifference(String s, String t) {

        String[] sArray = s.split("");
        String[] tArray = t.split("");

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        int minLen = Math.min(sArray.length, tArray.length);

        for (int i = 0; i < minLen; i++) {
            if (!sArray[i].equals(tArray[i])) return tArray[i].charAt(0);
        }

        return tArray[tArray.length - 1].charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
    }
}
