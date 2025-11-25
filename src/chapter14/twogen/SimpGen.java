package chapter14.twogen;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer,String> tgObj = new TwoGen<>(88,"Generics");

        tgObj.showTypes();

        int v = tgObj.ob1;
        System.out.println("value: " + v);

        String str = tgObj.ob2;
        System.out.println("value: " + str);
    }
}
