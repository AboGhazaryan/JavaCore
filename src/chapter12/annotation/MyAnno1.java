package chapter12.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Объявление типа аннотации, включая значения
// ее членов по умолчанию
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno1 {
    String str() default "Тестирование";
    int val () default 9000;
}
