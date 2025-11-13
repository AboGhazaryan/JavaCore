package chapter12.repeatedAnnotation;


import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


//сделать аннотацию MyAnno повторяющейся
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
public @interface MyAnno {
    String str() default "Тестирование";
    int val() default 9000;
}
