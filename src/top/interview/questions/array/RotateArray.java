package top.interview.questions.array;

public class RotateArray {
    public static void rotate(int[] nums, int k) {

        int[] numsRotated = new int[nums.length];

        for (int i = 0; i < k; i++) {
            numsRotated[i + (k % nums.length)] = nums[i];
        }

        for (int i : numsRotated) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7},2);
    }
}
