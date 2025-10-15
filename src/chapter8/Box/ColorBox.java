package chapter8.Box;
// Этот класс расширяет класс Вох,
// включая в него свойство цвета
public class ColorBox extends  Box {
    int color ;

    ColorBox(double w, double h,double d, int c){
        width = w;
        height = h;
        depth = d;
        color = c;
    }

}
