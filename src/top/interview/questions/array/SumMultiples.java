package top.interview.questions.array;

import java.util.stream.IntStream;

public class SumMultiples {
    public static int sumOfMultiples(int n) {
        int sum = 0;

        int[] nums = IntStream.rangeClosed(1, n).toArray();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0 || nums[i] % 5 == 0 || nums[i] % 7 == 0) sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfMultiples(7));
    }
}
