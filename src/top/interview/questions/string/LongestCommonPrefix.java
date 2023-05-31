package top.interview.questions.string;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int index = getMinLengthIndex(strs);

        for (int i = 0; i < strs[index].length(); i++) {
            char currentChar = strs[index].charAt(i);

            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return sb.toString();
                }
            }

            sb.append(currentChar);
        }

        return sb.toString();
    }

    public static int getMinLengthIndex(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));

    }
}
