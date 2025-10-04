package chapter6.ClassBox;

public class BoxDemo7 {
    public static void main(String[] args) {
        //объявить, выделить память и инициализировать объекты типа Вох
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);

        double vol;

        //получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Oбъeм равен " + vol);

        //получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм равен " + vol);
    }
}
