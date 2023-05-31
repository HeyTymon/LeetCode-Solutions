package top.interview.questions.string;

public class ReverseString
{
    public static void reverseString(char[] s) {
        char[] s2 = new char[s.length];

        for (int i = 0; i < s.length; i++) {
            s2[i] = s[s.length-1-i];
        }

        s = s2;

        for(char c : s)
        {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
    }
}
