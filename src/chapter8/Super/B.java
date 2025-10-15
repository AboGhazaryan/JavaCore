package chapter8.Super;
// создать подкласс путем расширения класса А
public class B extends A{
    int i ; // этот член i скрывает член i из класса А
    B(int a, int b ){
        super.i = a; //член i из класса А
        i = b;       //член i из класса В
    }

    void show(){
        System.out.println("Члeн i в суперклассе: " + super.i);
        System.out.println("Члeн i в подклассе: " + i);
    }
}
