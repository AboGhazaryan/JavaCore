package chapter7.OverloadDemo;

public class Overload1 {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10,20);

        ob.test(i);           //здесь вызывается вариант
                             //метода test(douЬle)
        ob.test(123.2);   //и здесь вызывается вариант
                             //метода  test(douЬle)

    }
}
