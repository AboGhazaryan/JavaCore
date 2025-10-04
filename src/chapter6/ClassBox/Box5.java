package chapter6.ClassBox;

public class Box5 {
    double width;
    double height;
    double depth;

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

    // установить разdмеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}