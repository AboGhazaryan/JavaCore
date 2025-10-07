package chapter7.stack2;

//Усовершенствованный класс Stack, в котором
//используется свойство длины массива
public class Stack {
    private int stck[];
    private int tos;

    // выделить память под стек и инициализировать его
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    //разметить элемент в стеке
    void push(int item) {
        if (tos == stck.length - 1)
            //разметить элемент в стеке
            System.out.println("Cтeк заполнен. ");
        else
            stck[++tos] = item;
    }

    //извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        }
        else
            return stck[tos --];
    }


}
