package top.interview.questions.math;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int sum = 0;
        int digit = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            switch (s.charAt(i)) {
                case 'I' -> digit = 1;
                case 'V' -> digit = 5;
                case 'X' -> digit = 10;
                case 'L' -> digit = 50;
                case 'C' -> digit = 100;
                case 'D' -> digit = 500;
                case 'M' -> digit = 1000;
                default -> System.out.println("Wrong char!");
            }

            if (digit * 4 < sum) sum -= digit;
            else sum += digit;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("X"));
        System.out.println(romanToInt("IXCM"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
