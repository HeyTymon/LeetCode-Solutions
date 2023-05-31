package top.interview.questions.string;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueLetter {
    public static int firstUniqChar(String s) {

        boolean condition = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if(i!=j)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        condition = false;
                        break;
                    }
                }
            }
            if(condition)
            {
                return i;
            }
            condition = true;
        }


        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
    }
}
