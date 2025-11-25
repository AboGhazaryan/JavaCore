package chapter14.geninter;

//Пример применения обобщенного интерфейса
//Обобщенный интерфейс MinMax для определения
//минимального и максимального значений
public interface MinMax <T extends Comparable> {
    T min();
    T max();
}
