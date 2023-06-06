package top.interview.questions.array;

import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public static int[] leftRightDifference(int[] nums) {

        int[] ans = new int[nums.length];
        int[] leftSumArray = new int[nums.length];
        int[] rightSumArray = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            leftSumArray[i] = leftSumArray[i-1] + nums[i-1];
        }


        for (int i = nums.length - 2; i >= 0; i--) {
            rightSumArray[i] = rightSumArray[i+1] + nums[i+1];
        }

        for (int i = 0; i <= ans.length - 1; i++) {
            ans[i] = Math.abs(leftSumArray[i] - rightSumArray[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        leftRightDifference(new int[]{10, 4, 8, 3});
    }
}
