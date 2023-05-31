package problems;

public class ContainsOne {
    public int singleNumber(int[] nums) {

        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;

    }
}

