package chapter14.genmeth;

//Продемонстрировать простой обобщенный метод
public class GenMethDemo {
    //определить, содержится ли объект в массиве
    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y){
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[]args){

        //применить метод isin() для целых чисел
        Integer nums[] = {1, 2, 3, 4, 5};

        if (isIn(2,nums)){
            System.out.println("Чиcлo 2 содержится в массиве num");
        }
        if (!isIn(7,nums)){
            System.out.println("Чиcлo 7 отсутствует в массиве num");
        }
        System.out.println();

        //применить метод isin() для символьных строк

        String strs[] = {"one","two","three","four","five"};

        if (isIn("two", strs)){
            System.out.println("two содержится в массиве strs");
        }
        if (!isIn("seven", strs)){
            System.out.println("seven отсутствует в массиве strs");
        }

    }
}
