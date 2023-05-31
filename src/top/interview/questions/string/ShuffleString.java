package top.interview.questions.string;

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {

        String[] sSeparated = s.split("");
        String[] sCopy = new String[sSeparated.length];

        for (int i = 0; i < indices.length; i++) {
            sCopy[indices[i]] = sSeparated[i];
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sCopy);

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }
}
