package top.interview.questions.array;

import java.util.HashSet;
import java.util.Set;


public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {

        Integer firstMax = null, secondMax = null, thirdMax = null;

        for (Integer i : nums) {

            if (i.equals(firstMax) || i.equals(secondMax) || i.equals(thirdMax)) continue;

                if (firstMax == null || firstMax < i) {

                    thirdMax = secondMax;
                    secondMax = firstMax;
                    firstMax = i;

                } else if (secondMax == null || secondMax < i) {

                    thirdMax = secondMax;
                    secondMax = i;

                } else if (thirdMax == null || thirdMax < i) {
                    thirdMax = i;
                }
        }

        if(thirdMax == null) return firstMax;

        return thirdMax;
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{2, 2, 3, 1}));
    }
}
