package top.interview.questions.string;

public class GoalParserInterpretation {
    public static String interpret(String command) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            switch (command.charAt(i)) {
                case 'G' -> sb.append("G");
                case '(' -> {
                    if (command.charAt(i + 1) == ')') {
                        sb.append("o");
                        i++;
                    } else {
                        sb.append("al");
                        i += 3;
                    }
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));
    }
}
