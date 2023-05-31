package problems;

import java.lang.reflect.Array;
import java.util.*;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) return i;
        }

        List<Integer> numsWithTarget = new ArrayList<>();
        numsWithTarget.add(target);

        for(int i : nums)
        {
            numsWithTarget.add(i);
        }

        Collections.sort(numsWithTarget);

        for (int i = 0; i < numsWithTarget.size(); i++) {
            if(numsWithTarget.get(i) == target) return i;
        }

        return 0;
    }

    public static void main(String[] args) {

        System.out.println(searchInsert(new int[]{1,3,5,6},5));
        System.out.println(searchInsert(new int[]{1,3,5,6},2));
        System.out.println(searchInsert(new int[]{1,3,5,6},7));
    }
}
