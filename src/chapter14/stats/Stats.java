package chapter14.stats;

//В этой версии класса Stats аргумент типа Т должен
// быть классом NumЬer или наследуемым от него классом
public class Stats<T extends  Number> {
    T[] nums; //массив класса NumЬer или его подкласса

    //передать конструктору ссылку на массив элементов
    //класса NumЬer или его подкласса

    Stats(T[] o){
        nums = o;
    }

    //возвратить значение типа douЫe в любом случае

    Double average(){
        Double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum/ nums.length;
    }
}
