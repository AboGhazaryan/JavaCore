package chapter12.annotation;

import java.lang.reflect.Method;

//Объявление типа аннотации, включая значения
//ее членов по умолчанию
public class Meta3 {
    // аннотировать метод, используя значения по умолчанию
    @MyAnno1()
    public static void myMeth(){
        Meta3 ob =  new Meta3();

        // получить аннотацию для данного метода
        // и вывести значения ее членов

        try{
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");
            MyAnno1 anno1 = m.getAnnotation(MyAnno1.class);
            System.out.println(anno1.str() + " " + anno1.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
