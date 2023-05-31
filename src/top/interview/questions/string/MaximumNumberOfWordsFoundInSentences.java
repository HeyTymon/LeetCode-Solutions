package top.interview.questions.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumNumberOfWordsFoundInSentences {
    public static int mostWordsFound(String[] sentences) {

        List<String[]> separatedWords = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(String s: sentences)
        {
            separatedWords.add(s.split(" "));
        }

        for (int i = 0; i < separatedWords.size(); i++) {
            if(separatedWords.get(i).length > max) max = separatedWords.get(i).length;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }
}
