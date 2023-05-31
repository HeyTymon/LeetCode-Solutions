package top.interview.questions.math;

import java.util.stream.IntStream;

public class CountThePrimes {
    public static int countPrimes(int n) {

        if (n < 2) return 0;

        int counter = 0, primesCounter = 0;

        for (int i = 2; i < n; i++) {
            for (int j = 2; j < n; j++) {
                if (i % j == 0) counter++;
            }
            if (counter == 1) primesCounter++;
            counter = 0;
        }

        return primesCounter;
    }

    //Sieve of Eratosthenes algorithm
    public static int countPrimesMoreEfficient(int n)
    {
        if (n < 2) {
            return 0;
        }

        boolean[] isComposite = new boolean[n];
        int primesCounter = 0;

        for (int i = 2; i * i < n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j < n; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (!isComposite[i]) {
                primesCounter++;
            }
        }

        return primesCounter;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(11));
    }

}
