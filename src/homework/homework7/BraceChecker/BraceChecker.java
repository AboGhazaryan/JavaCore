package homework.homework7.BraceChecker;

public class BraceChecker {

    private Stack stack;

    public void check(String text) {
        stack = new Stack(text.length());
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int last;

            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error : Closed By ) but not closed at index " + i);
                    } else if (last != '(') {
                        System.err.println("Error : Opened by " + (char) last + " but closed at ) at index " + i);
                    }
                    break;
                case '}':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error : Closed By } but not closed at index " + i);
                    } else if (last != '{') {
                        System.err.println("Error : Opened by " + (char) last + " but closed at } at index " + i);
                    }
                    break;
                case ']':
                    last = stack.pop();
                    if (last == 0) {
                        System.err.println("Error : Closed By ] but not closed at index " + i);
                    } else if (last != '[') {
                        System.err.println("Error : Opened by " + (char) last + " but closed at ] at index " + i);
                    }
                    break;
            }
        }
        int last;
        while ((last = stack.pop()) != 0){
            System.err.println("Error: Opend " + (char)last + " witherr closing");
        }

    }
}
