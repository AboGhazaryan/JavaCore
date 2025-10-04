package chapter7.OverloadDemo;

//Применить автоматическое преобразование типов к перегрузке
public class OverloadDemo1 {
    void test(){
        System.out.println("Пapaмeтpы отсутствуют");
    }

    //Перегружаемый метод, проверяющий наличие
    // двух целочисленных параметров
    void test(int a, int b){
        System.out.println("a и b: " + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие
    //параметра типа double
    void test(double a){
        System.out.println("Bнyтpeннee преобразование при вызове " + "test(double) a: " + a);
    }
}
