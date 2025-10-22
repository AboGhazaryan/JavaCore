package chapter8.Abstract;
// Простой пример абстракции
abstract class A {
    abstract void callme();

    // абстрактные классы все же могут
    // содержать конкретные методы

    void callmeto(){
        System.out.println("Этo конкретный метод. ");
    }

}
