package top.interview.questions.array;

public class FinalValueOfVariableAfterPerformingOperations {

    public static int finalValueAfterOperations(String[] operations) {

        int x = 0;

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i].charAt(1))
            {
                case '-' -> x--;
                case '+' -> x++;
            }
        }

        return x;
    }

    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"--X","X++","X++"}));
    }
}
