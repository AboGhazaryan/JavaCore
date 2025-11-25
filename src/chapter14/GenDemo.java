package chapter14;

//продемонстрировать применение обобщенного класса
public class GenDemo {
    public static void main(String[] args) {
        //Создать ссылку типа Gen для целых чисел
        Gen<Integer> iOb;

        //Создать объект типа Gen<Integer> и присвоить
        //ссылку на него переменной iOb. Обратите внимание на
        //применение автоупаковки для инкапсуляции значения 88
        //в объекте типа Integer
        iOb = new Gen<>(88);


        //показать тип данных, хранящихся в переменной iOb
        iOb.showType();

        //получить значение переменной iOb. Обратите
        //внимание на то, что для этого не требуется
        //никакого приведения типов

        int v = iOb.getOb();
        System.out.println("Знaчeниe: " + v);
        System.out.println();

        // создать объект типа Gen для символьных строк
        Gen<String>strOb = new Gen<>("Тест обобщений");

        //показать тип данных, хранящихся в переменной strOb
        strOb.showType();

        //получить значение переменной strOb. И в этом
        //случае приведение типов не требуется
        String str = strOb.getOb();
        System.out.println("Знaчeниe: " + str);


    }
}
