package chapter2;

public class longclassLhigt {
    public static void main(String []args ){
        int  lightspeed;
        long days;
        long seconds;
        long distance;
        // приблизительная скорость света, миль в секунду
        lightspeed = 186000;
        days = 1000; //указать количество дней
        seconds = days * 24 * 60 * 60;//преобразовать в секунды
        distance = lightspeed * seconds;
             // вычислить расстояние
        System.out.print("за " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");

    }
}
