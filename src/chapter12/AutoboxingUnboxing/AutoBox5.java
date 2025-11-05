package chapter12.AutoboxingUnboxing;

// Автоупаковка/распаковка значений
//из классов Boolean и Character
public class AutoBox5 {
    public static void main(String[] args) {

        // Автоупаковка/распаковка логического
        // значения типа boolean
        Boolean b = true;

        // объект Ь автоматически распаковывается,
        //когда он употребляется в условном операторе if
        if(b) System.out.println("b равно true");

        //Автоупаковка/распаковка значения типа char
        Character ch = 'x';
        char ch2 = ch;
        System.out.println("ch2 равно " + ch2);
    }
}
