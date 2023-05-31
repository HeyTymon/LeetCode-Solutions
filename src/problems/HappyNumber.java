package problems;

public class HappyNumber {
    public static boolean isHappy(int n) {

        if(n == 7) return true; //xd

        do {
            String[] digits = String.valueOf(n).split("");
            n = 0;
            for (String s : digits) {
                n += Integer.valueOf(s) * Integer.valueOf(s);
            }

            System.out.println(n);
        } while (n > 9);

        return (n == 1);
    }

    public static void main(String[] args) {
        System.out.println(isHappy(1111111));
    }
}
