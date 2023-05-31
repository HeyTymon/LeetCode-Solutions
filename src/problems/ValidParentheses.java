package problems;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {

    public static boolean isValidAdvanced(String s)
    {
        if(!(s.length() % 2 == 0)) return false;

        List<Character> stackList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i))
            {
                case ')' -> {
                    if((stackList.size() != 0) && (stackList.get(stackList.size()-1) == '(')) stackList.remove(stackList.size()-1);
                    else return false;
                }
                case '}' -> {
                    if((stackList.size() != 0) && (stackList.get(stackList.size()-1) == '{')) stackList.remove(stackList.size()-1);
                    else return false;
                }
                case ']' -> {
                    if((stackList.size() != 0) && (stackList.get(stackList.size()-1) == '[')) stackList.remove(stackList.size()-1);
                    else return false;
                }

                default -> stackList.add(s.charAt(i));
            }

        }

        if(stackList.size() != 0) return false;

        return true;
    }

    public static boolean isValid(String s) {

        if(!(s.length() % 2 == 0)) return false;

        for (int i = 0; i < s.length(); i += 2) {
            switch (s.charAt(i))
            {
                case '(' -> {
                    if(!(s.charAt(i+1) == ')')) return false;
                }
                case '[' -> {
                    if(!(s.charAt(i+1) == ']')) return false;
                }
                case '{' -> {
                    if(!(s.charAt(i+1) == '}')) return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidAdvanced("(("));
    }
}
