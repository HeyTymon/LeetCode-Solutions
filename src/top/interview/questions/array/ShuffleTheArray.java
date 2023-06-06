package top.interview.questions.array;

import java.util.Arrays;

public class ShuffleTheArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] nums2 = new int[nums.length];

        for (int i = 0; i < n; i ++) {
            nums2[2 * i] = nums[i];
            nums2[2 * i + 1] = nums[i + n];
        }

        return nums2;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7},3)));
    }
}
