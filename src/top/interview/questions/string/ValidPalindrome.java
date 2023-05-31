package top.interview.questions.string;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {

        if(s.equals(" ")) return true;

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        if(s.equals(sb.toString())) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}
