package homework.homework7.BraceChecker;

public class Stack {
    private int[] array = new int[10];
    public int tos;


    public Stack(){
        tos = -1;
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
