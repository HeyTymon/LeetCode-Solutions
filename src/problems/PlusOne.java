package problems;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] != 9) digits[digits.length - 1]++;
        else {
            long number = 0;
            for (int i = 0; i < digits.length; i++) {
                number += Math.pow(10, i) * digits[digits.length - 1 - i];
            }
            number++;

            String numberString = String.valueOf(number);
            String[] numberStringArray = numberString.split("");

            digits = Arrays.stream(numberStringArray).mapToInt(Integer::parseInt).toArray();

        }

        return digits;
    }

    public static int[] plusOne2(int[] digits)
    {
        StringBuilder sb = new StringBuilder();

        for(int i : digits)
        {
            sb.append(i);
        }

        BigInteger bigInteger = new BigInteger(sb.toString());
        bigInteger = bigInteger.add(new BigInteger("1"));

        String[] numberStrings = bigInteger.toString().split("");
        int[] output = new int[numberStrings.length];

        for (int i = 0; i < output.length; i++) {
            output[i] = Integer.valueOf(numberStrings[i]);
        }

        return output;
    }

    public static void main(String[] args) {

       for(int i : plusOne2(new int[]{5,2,2,6,5,7,1,9,0,3,8,6,8,6,5,2,1,8,7,9,8,3,8,4,7,2,5,8,9}))
       {
           System.out.print(i);
       }
    }
}
