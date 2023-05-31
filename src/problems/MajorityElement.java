package problems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {

        if (nums.length == 1) return nums[0];

        Map<Integer, Integer> integerHashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!integerHashMap.containsKey(nums[i])) {
                integerHashMap.put(nums[i], 1);
            } else {
                integerHashMap.put(nums[i], integerHashMap.get(nums[i]) + 1);
            }
        }

        return Collections.max(integerHashMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1,1,1,2,3,2,4}));
    }
}
