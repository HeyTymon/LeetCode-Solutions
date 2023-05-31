package top.interview.questions.math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {

        List<String> outputList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0)  outputList.add("FizzBuzz");
            else if (i % 3 == 0) outputList.add("Fizz");
            else if (i % 5 == 0) outputList.add("Buzz");
            else outputList.add(String.valueOf(i));
        }

        return outputList;
    }

    public static void main(String[] args) {
        fizzBuzz(15).forEach(System.out::println);
    }
}
