package chapter14.geninter;

//реализовать обобщенный интерфейс MinMax
public class MyClass <T extends  Comparable <T>> implements MinMax<T> {
    T[] vals;

    MyClass (T [] o){
        vals = o;
    }

    //возвратить минимальное значение из массива vals

    @Override
    public T min (){
        T v = vals[0];

        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0){
                v = vals[i];
            }
        }
        return v;
    }

    // возвратить максимальное значение из массива vals
    @Override
    public T max(){
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0){
                v = vals[i];
            }
        }
        return v;
    }
}
