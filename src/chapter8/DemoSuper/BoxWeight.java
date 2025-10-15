package chapter8.DemoSuper;
// Теперь в классе BoxWeight полностью
//реализованы все конструкторы
public class BoxWeight extends Box {
    double weigth; //вес параллелепипеда

    //сконструировать клон обьекта
    BoxWeight(BoxWeight ob){ //передать объект конструктору
        super(ob);
        weigth = ob.weigth;
    }

    // конструктор, применяемый при указании всех параметров
    BoxWeight(double w, double h,double d,double m){
        super (w, h, d); // вызвать конструктор из суперкласса
        weigth = m;
    }
    //конструктор, применяемый по умолчанию
    BoxWeight(){
        super();
        weigth = -1;
    }

    //конструктор, применяемый при саздании куба
    BoxWeight( double len, double m){
        super(len);
        weigth = m;
    }
}
