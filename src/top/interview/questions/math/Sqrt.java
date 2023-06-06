package top.interview.questions.math;

public class Sqrt {
    public int mySqrt(int x) {

        int leftPointer = 0;
        int rightPointer = x;
        int ans = 0;

        while (leftPointer <= rightPointer) {
            int middle = leftPointer + ((rightPointer - 1) / 2);

            if (middle * middle > x) {
                rightPointer = middle - 1;
            } else if (middle * middle < x) {
                leftPointer = middle + 1;
                ans = middle;
            } else {
                return middle;
            }
        }

        return ans;
    }
}
