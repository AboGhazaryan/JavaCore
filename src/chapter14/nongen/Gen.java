package chapter14.nongen;

public class Gen <T> extends  Nongen{
    T ob;

    Gen(T o, int i){
        super(i);
        ob = o;
    }

    T getOb(){
        return ob;
    }
}
