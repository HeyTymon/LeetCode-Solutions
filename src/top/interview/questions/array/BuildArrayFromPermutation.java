package top.interview.questions.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {

        if(nums.length == 1) return nums;

        int[] numsPermuted = new int[nums.length];

        for(int i = 0; i < nums.length; i++)
        {
           numsPermuted[i] = nums[nums[i]];
        }

        return numsPermuted;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArray(new int[]{0,2,1,5,3,4})));
    }
}
