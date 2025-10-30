package chapter2;

public class IfSample {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        //true,false
        if (x < y) {
            System.out.println("x меньше y");
        }
        x = x * 2;
        if (x == y){
            System.out.println("x теперь равно у");
        }
        x = x * 2;
        if (x > y){
            System.out.println("x теперь больше у");
        }
        x = x * 2;
        if (x == y){
            System.out.println("вы не увидите этого");
        }

    }
}
