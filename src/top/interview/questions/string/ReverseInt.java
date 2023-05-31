package top.interview.questions.string;

public class ReverseInt {
    public static int reverse(int x) {

        if (x < 0) {
            x = -x;
            StringBuilder sb = new StringBuilder(String.valueOf(x));
            String number = sb.reverse().toString();

            sb.setLength(0);
            sb.append("-");
            sb.append(number);

            return Integer.valueOf(sb.toString());
        }

        StringBuilder sb = new StringBuilder(String.valueOf(x));
        sb.reverse();

        return Integer.valueOf(sb.toString());
    }



    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
