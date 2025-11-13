package chapter12.annotation;
import java.lang.reflect.Method;

public class Single {
    //аннотировать метод одночленной аннотацией
    @MySingle(100)
    public static void myMeth(){
        Single ob = new Single();

        try{
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value());
            // выводит значение 100
        }catch (NoSuchMethodException exc){
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }

}
