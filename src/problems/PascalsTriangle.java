package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            List<Integer> previousRow = triangle.get(i - 1);

            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j-1)+previousRow.get(j));
            }

            currentRow.add(1);
            triangle.add(currentRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(generate(20));
    }
}
