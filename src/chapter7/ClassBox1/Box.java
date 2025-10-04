package chapter7.ClassBox1;

public class Box {
    double width;
    double heigth;
    double depth;

    //Обратите внимание на этот конструктор. В качестве
    //параметра в нем используется объект типа Вох
    Box(Box ob) {            //передать объект конструктору
        width = ob.width;
        heigth = ob.heigth;
        depth = ob.depth;
    }

    //конструктор, используемый, когда
    //указываются все размеры
    Box(double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }

    // конструктор, используемый, если ни один из
    //размеров не указан
    Box() {
        width = -1;
        heigth = -1;
        depth = -1;
    }
    //конструктор, используемый при создании куба
    Box(double len){
      width = heigth = depth = len;
    }
    //рассчитать и возвратить объем
    double volume(){
        return width * heigth * depth;
    }
}
