package top.interview.questions.string;

import java.util.Arrays;

public class SortingTheSentence {
    public static String sortSentence(String s) {

        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];

        for (String word : words) {
            int index = word.charAt(word.length() - 1) - '1';
            sortedWords[index] = word.substring(0, word.length() - 1);
        }

        for (String word : sortedWords)
        {
            sb.append(word).append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
}
