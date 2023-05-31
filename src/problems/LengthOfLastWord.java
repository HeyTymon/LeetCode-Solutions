package problems;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {

        if(s.equals(" ")) return 0;

        String[] strings = s.split(" ");

        return strings[strings.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static class FibonacciIteration {

        int first = 0;
        int second = 1;
        int tmp;

    }
}
