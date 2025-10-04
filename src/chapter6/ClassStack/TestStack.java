package chapter6.ClassStack;

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mysteck2 = new Stack();

        // разместить числа в стеке
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++)mysteck2.push(i); ;


        // извлечь эти числа из стека
        System.out.println("Coдepжимoe стека mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

            System.out.println("Coдepжимoe стека mystack2:");
            for (int i = 0; i <10; i++){
                System.out.println(mysteck2.pop());
            }





    }
}
