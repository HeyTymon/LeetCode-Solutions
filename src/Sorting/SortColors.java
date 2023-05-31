package Sorting;

public class SortColors {
    public static void sortColors(int[] nums) {

        int r = 0;
        int w = 0;
        int b = 0;

        for (int i = 0; i < nums.length; i++) {
            switch (nums[i])
            {
                case 0 -> r++;
                case 1 -> w++;
                case 2 -> b++;
            }
        }

        for (int i = 0; i < nums.length; i++) {

            if(i<r) nums[i] = 0;
            else if (i < r + w) nums[i] = 1;
            else if (i < r + w + b) nums[i] = 2;
        }

        for(int i : nums)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        sortColors(new int[]{2,0,2,1,1,0});
    }
}
