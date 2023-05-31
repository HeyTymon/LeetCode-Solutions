package top.interview.questions.string;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> integerSet = new HashSet<>();

        for (int i : nums) {
            integerSet.add(i);
        }

        return (integerSet.size() == nums.length) ? false : true;
    }
}
