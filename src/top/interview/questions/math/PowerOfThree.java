package top.interview.questions.math;

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {

        if (n == 1) return true;

        double N = Double.valueOf(n);

        while (N > 3) {
            N = N / 3;
        }

        return (N == 3.0) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(15));
    }
}
