package top.interview.questions.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {

            int[] nums2 = new int[nums.length*2];

            for (int i = 0; i < nums.length; i++) {
                nums2[i] = nums[i];
                nums2[i+ nums.length] = nums[i];
            }

            return nums2;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1,2,1})));
    }
}
