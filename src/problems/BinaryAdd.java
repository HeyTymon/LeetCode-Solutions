package problems;

public class BinaryAdd {
    public static String addBinary(String a, String b) {

        Long aInt = Long.parseLong(a,2);
        Long bInt = Long.parseLong(b,2);
        Long output = aInt + bInt;

        return Long.toBinaryString(output);
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
    }
}
