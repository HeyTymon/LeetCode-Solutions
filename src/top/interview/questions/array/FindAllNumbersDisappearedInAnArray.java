package top.interview.questions.array;

import java.util.*;

public class FindAllNumbersDisappearedInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> digits = new HashSet<>();

        for (int i : nums) {
            digits.add(i);
        }

        List<Integer> output = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (!digits.contains(i)) output.add(i);
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

}
