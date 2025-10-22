package chapter8.Shipment;

//добавить поле веса
public class BoxWeight extends Box {
    double weight; //вес параллелепипеда

    //сконструировать клон объекта
    BoxWeight(BoxWeight ob) { //передать объект конструктору
        super(ob);
        weight = ob.weight;
    }

    // конструктор, применяемый при указании всех параметров
    BoxWeight(double w, double h, double d, double m){
        super(w,h,d); //вызвать конструктор суперкласса
        weight = m;
    }

    // конструктор, применяемый по умолчанию
    BoxWeight(){
        super();
        weight = -1;
    }

    // конструктор, применяемый  при создании куба
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }


}
