package chapter12.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Одночленная аннотация
@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
    int value();  // эта переменная должна иметь имя value
}
