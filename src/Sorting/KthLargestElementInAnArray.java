package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthLargestElementInAnArray {
    public static int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        return nums[nums.length-k];
    }

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4));
    }
}
