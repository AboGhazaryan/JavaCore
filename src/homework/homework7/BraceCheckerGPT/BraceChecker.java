package homework.homework7.BraceCheckerGPT;

public class BraceChecker {

    private final String text;
    private final Stack stack = new Stack();

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c, i);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    System.out.println("Error: closed " + c + " at " + i + " but nothing was opened");
                    continue;
                }

                char lastOpen = stack.popSymbol();
                int index = stack.popIndex();

                if (!matches(lastOpen, c)) {
                    System.out.println("Error: opened " + lastOpen + " at " + index + " but closed " + c + " at " + i);
                }
            }
        }

        while (!stack.isEmpty()) {
            char unclosed = stack.popSymbol();
            int index = stack.popIndex();
            System.out.println("Error: opened " + unclosed + " at " + index + " but not closed");
        }
    }

    private boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }



}
