package chapter14.gensuper;

public class Gen <T>{
    T ob;

    Gen (T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }
}
