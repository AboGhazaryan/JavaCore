package chapter14.genericcons;

public class GenConsDemo {
    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test1 = new GenCons(123.5F);

        test.showVal();
        test1.showVal();
    }
}
