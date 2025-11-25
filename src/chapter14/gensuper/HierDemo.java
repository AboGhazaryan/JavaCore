package chapter14.gensuper;

public class HierDemo {
    public static void main(String[] args) {
        Gen2<String , Integer> x = new Gen2<>("Значение равно: ",99);
        System.out.println(x.getOb());
        System.out.println(x.getOb2());

    }
}
