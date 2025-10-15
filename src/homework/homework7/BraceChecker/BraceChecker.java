package homework.homework7.BraceChecker;

public class BraceChecker {

    private String text;
    private Stack stack = new Stack();

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.tos == -1) {
                    System.out.println("Error : Closed By " + c + "but not closed at index" + i);
                }
                int top = stack.pop();
                char first = (char) top;
                
                if ((c == '}' && first != '{') || (c == ']' && first != '[') || (c == ')' && first != '(')) {
                    System.out.println("Error : Opened by " + first + "but closed at " + c + "at index " + i);
                }
            }
        }

    }
}
