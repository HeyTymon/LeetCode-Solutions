package problems;

public class AddDigits {
    public static int addDigits(int num) {
        if (num < 10) return num;

        int digitSum = 0;
        String[] digits = String.valueOf(num).split("");

        for(String s : digits)
        {
            digitSum += Integer.valueOf(s);
        }

        if(digitSum >= 10) digitSum  = addDigits(digitSum);

        return digitSum;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}
