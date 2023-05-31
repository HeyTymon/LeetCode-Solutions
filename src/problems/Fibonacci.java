package problems;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    int first = 0;
    int second = 1;
    int tmp;
    List<Integer> integerList = new ArrayList<>();

    public void fibonacciRecursion(int value) {
        if (value < 1) return;
        value--;

        integerList.add(first);

        tmp = second;
        second += first;
        first = tmp;

        fibonacciRecursion(value);
    }

    public int sumEven(int n) {
        int sum = 0;

        for (Integer i : integerList) {
            if (i % 2 == 0 && i < n) sum += i;
        }

        return sum;
    }
}
