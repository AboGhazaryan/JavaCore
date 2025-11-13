package chapter12.repeatedAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnno {

    //овторить аннотацию MyAnno в методе myMeth()
    @MyAnno(str = "First annotation", val = -1)
    @MyAnno(str = "Вторая аннотация", val = 100)
    public static void myMeth(String str, int i){
        RepeatAnno ob = new RepeatAnno();

        try{
            Class<?> c = ob.getClass();

            //получить аннотации для метода myMeth()
            Method m = c.getMethod("myMeth", String.class, int.class);

            //вывести повторяющиеся аннотации MyAnno
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        }catch (NoSuchMethodException exc ){
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("тecт", 10);
    }
}
