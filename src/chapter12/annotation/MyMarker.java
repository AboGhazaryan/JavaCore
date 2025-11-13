package chapter12.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Маркерная аннотация
@Retention(RetentionPolicy.RUNTIME)
public @interface MyMarker {
}
