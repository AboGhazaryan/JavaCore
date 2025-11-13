package chapter12.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//Параметризированная аннотация, которую можно
// применить к типу данных
@Target(ElementType.TYPE_USE)
public @interface MaxLen {
    int value();
}
