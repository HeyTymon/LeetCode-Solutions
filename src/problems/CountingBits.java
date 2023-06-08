package problems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CountingBits {

    public static int[] countBitsBinaryOperations(int n)
    {
        int[] ans = new int[n+1];
        for (int i = 0; i <= n; i++) {
            ans[i] = ans[i >> 1] + i % 2;
        }

        return ans;
    }

    public static int[] countBitsStream(int n)
    {
        return IntStream.rangeClosed(0,n).map(i -> Integer.bitCount(i)).toArray();
    }

    public static int[] countBits(int n) {

        String[] numbers = new String[n+1];
        int[] ans = new int[n+1];

        for (int i = 0; i <= n; i++) {
            numbers[i] = Integer.toBinaryString(i);
            for (int j = 0; j < numbers[i].length(); j++) {
                if(numbers[i].charAt(j) == '1')
                {
                   ans[i] += 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
        System.out.println(Arrays.toString(countBitsStream(5)));
        System.out.println(Arrays.toString(countBitsBinaryOperations(5)));
    }
}
