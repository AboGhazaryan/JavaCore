package chapter6.ClassBox;

public class BoxDemo6 {
    public static void main(String[] args) {
        //объявить, выделить память и инициализировать
        ///объекты типа Вох
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();

        double vol;

        //получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Oбъeм равен " + vol);
        //получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм равен " + vol);
    }
}
