package top.interview.questions.string;

import java.util.Arrays;

public class isAnagram {
    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        String[] sArray = s.split("");
        String[] tArray = t.split("");

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for (int i = 0; i < sArray.length; i++) {
           if(!sArray[i].equals(tArray[i])) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
