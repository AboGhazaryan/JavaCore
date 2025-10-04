package chapter6.ClassBox;

public class Box6 {
    double width;
    double height;
    double depth;
    //Это конструктор класса Вох6
    Box6(){
       System.out.println("Koнcтpyиpoвaниe объекта Вох");
       width = 10 ;
        height = 10;
        depth = 10;
   }
   //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;

    }
}
