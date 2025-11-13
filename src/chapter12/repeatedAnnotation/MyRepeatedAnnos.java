package chapter12.repeatedAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Это контейнерная аннотация
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRepeatedAnnos {
    MyAnno[] value();
}
