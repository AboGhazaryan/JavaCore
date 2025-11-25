package chapter14.nongen;

public class HierDemo2 {

    public static void main(String[] args) {
        Gen<String> w = new Gen<>("Добро пожаловать", 47);
        System.out.println(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
