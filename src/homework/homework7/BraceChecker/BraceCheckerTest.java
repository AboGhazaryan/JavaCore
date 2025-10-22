package homework.homework7.BraceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker bc = new BraceChecker();
        String text = "Hello from java]}";
        String text1 = "Hello ({from)} java)]";


        bc.check(text);


    }


}
