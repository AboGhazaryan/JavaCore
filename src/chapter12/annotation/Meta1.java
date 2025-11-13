package chapter12.annotation;

import java.lang.reflect.Method;

public class Meta1 {
    // У метода myMeth() теперь имеются два аргумента
    @MyAnno(str = "Два параметра",val = 19)
    public static void myMeth(String str, int i){
        //Meta1 ob = new Meta1();

        try{
            Class<?> c = Meta1.class; //ob.getClass();

            // Здесь указываются типы параметров
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        }catch(NoSuchMethodException exc){
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("Tecт", 10);
    }
}
