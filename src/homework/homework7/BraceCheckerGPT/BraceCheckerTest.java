package homework.homework7.BraceCheckerGPT;

public class BraceCheckerTest {

    public static void main(String[]args){
        String text = "Hello ((((from) [java}";
        String text1 = "Hello from [java]";
        BraceChecker bc = new BraceChecker(text);
        bc.check();

    }
}
