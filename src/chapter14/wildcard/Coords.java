package chapter14.wildcard;

//Этот класс хранит массив координатных объектов
public class Coords<T extends TwoD> {
    T[] coords;
    Coords(T[] o){
        coords = o;
    }
}
