package chapter12.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Аннотация, которую можно применить в объявлении поля
@Target(ElementType.FIELD)
public @interface EmptyOK {
}
