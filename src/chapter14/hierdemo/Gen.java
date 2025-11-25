package chapter14.hierdemo;

public class Gen <T>{
    T ob;


    Gen(T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }
}
