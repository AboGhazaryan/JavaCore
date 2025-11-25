package chapter14.bridgemethod;

//Подкласс, производный от класса Gen
public class Gen2 extends Gen<String>{
    Gen2( String o ){
        super(o);
    }
    //перегрузить метод getob() для получения
    // символьных строк

    String getob(){
        System.out.println("Bызвaн метод String getob(): ");
        return ob;
    }
}
