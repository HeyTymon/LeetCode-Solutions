package problems;

public class MissingNumber {
    public static int missingNumber(int[] nums) {

        boolean[] isPresent = new boolean[nums.length+1];

        for (int num : nums) {
            isPresent[num] = true;
        }

        for (int i = 0; i < isPresent.length; i++) {
            if(!isPresent[i]) return i;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
    }
}
