package chapter14.statss;


//Применение метасимволов подстановки

//в качестве аргументов
public class Stats<T extends Number> {
    T[] nums;


    //передать конструктору ссылку на массив
    //элементов класса NumЬer или его подкласса
    Stats ( T[] o){
        nums = o;
    }

    //возвратить значение типа douЫe в любом случае
    double average(){
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum/ nums.length;
    }

    //Определить равенство двух средних значений.
    //Обратите внимание на применение
    // метасимвола подстановки
    Boolean sameAvg(Stats<?> ob){
        if (average() == ob.average()){
            return true;
        }
        return false;
    }

}
