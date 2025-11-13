package chapter12.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Аннотация, которую можно применить в объявлении метода
@Target(ElementType.METHOD)
public @interface Recommended {
}
