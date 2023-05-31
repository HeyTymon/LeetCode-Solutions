package top.interview.questions;

public class TwoSum
{
    public static int[] twoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <nums.length; j++) {
                if(i!=j)
                {
                    if(nums[i]+nums[j] == target) return new int[]{i,j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{3,3},6)[0]);
        System.out.println(twoSum(new int[]{3,3},6)[1]);
    }
}
