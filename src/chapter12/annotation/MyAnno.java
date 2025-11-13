package chapter12.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Объявление типа аннотации
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str();
    int val();
}
