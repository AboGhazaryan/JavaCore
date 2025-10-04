package chapter6.ClassBox;

public class Box7 {
    double width;
    double height;
    double depth;

    //Это конструктор класса Вох
    Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

}
