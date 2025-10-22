package homework.homework7.BraceChecker;

public class Stack {
    private int[] array;
    public int tos;


    public Stack(){
        tos = -1;
        array = new int[10];
    }
    Stack(int length){
        tos = - 1;
        array = new int[length];
    }


    public void push(int value ){
        if (tos == array.length - 1){
            System.out.println("stack-ը վերջացավ ");
        } else {
            array[++tos] =value;
        }
    }

    public int pop(){
        if (tos < 0) {
            System.out.println("stack-ը դատարկ է");
            return 0;
        }else{
            return array[tos--];
        }


    }

}
