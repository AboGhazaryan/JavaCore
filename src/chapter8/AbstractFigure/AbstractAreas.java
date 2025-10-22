package chapter8.AbstractFigure;

public class AbstractAreas {
    public static void main(String[] args) {
        //Figure f = new Figure(lO, 10); /!теперь недопустимо
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figref;  // верно, хотя объект не создается

        figref = r;
        System.out.println("Плoщaдь равна " + figref.area());

        figref = t;
        System.out.println("Плoщaдь равна " + figref.area());

    }
}
