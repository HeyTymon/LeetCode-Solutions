package problems;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MajorityElementTwo {
    public static List<Integer> majorityElement(int[] nums) {

        HashMap<Integer, Integer> integerHashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!integerHashMap.containsKey(nums[i])) {
                integerHashMap.put(nums[i], 1);
            } else {
                integerHashMap.put(nums[i], integerHashMap.get(nums[i]) + 1);
            }
        }

        return  integerHashMap.keySet().stream().filter(key -> integerHashMap.get(key) > nums.length/3).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println();
    }
}
