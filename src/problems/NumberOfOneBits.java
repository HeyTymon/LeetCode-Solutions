package problems;

public class NumberOfOneBits {

    public static int hammingWeightBetter(int n)
    {
        int onesCounter = 0;

        for (int i = 0; i < 32; i++) {

            if((n&1) == 1) onesCounter++;

            n>>=1;
        }

        return onesCounter;
    }
    public static int hammingWeight(int n) {

        String[] bits = Integer.toBinaryString(n).split("");
        int onesCounter = 0;

        for(String s : bits)
        {
            if(s.equals("1")) onesCounter++;
        }

        return onesCounter;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }
}
