package chapter8.Box;

//расширить класс Вох, включив в него поле веса
public class BoxWeight extends Box{
    double weight; //вес параллелепипеда

    //конструктор BoxWeight()
    BoxWeight(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
