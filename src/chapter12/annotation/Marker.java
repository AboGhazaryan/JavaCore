package chapter12.annotation;

import java.lang.reflect.Method;

public class Marker {
    //аннотировать метод с помощью маркера
    //Обратите внимание на обязательность скобок ()
    @MyMarker
    public static void myMeth(){
        Marker ob = new Marker();
        try{
            Method m = ob.getClass().getMethod("myMeth");
            //определить наличие аннотации
            if(m.isAnnotationPresent(MyMarker.class))
                System.out.println("Маркерная аннотация MyMarker присутствует.");
        }catch (NoSuchMethodException exc){
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
