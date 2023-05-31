package top.interview.questions.string;

import java.util.Arrays;

public class DefangingAnIPAddress {
    public static String defangIPaddr(String address) {

        String[] parts = address.split("\\.");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            sb.append(parts[i]);
            sb.append("[.]");
        }

        sb.append(parts[3]);

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.100.50.0"));

    }
}
