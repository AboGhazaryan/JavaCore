package chapter12.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
//Аннотация, которую можно применить к параметру типа
@Target(ElementType.TYPE_PARAMETER)
public @interface What {
    String description();
}
