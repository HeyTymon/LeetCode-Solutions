package top.interview.questions.array;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int pairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i!=j && nums[i] == nums[j]) pairs++;
            }
        }

        return pairs/2;
    }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,1,1,1}));
    }
}
