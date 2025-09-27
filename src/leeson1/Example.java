package leeson1;

public class Example {
    public static void main(String[] args) {
        //int  num = 550;{
        //    System.out.println(num * 100);
        //  num =50;
        //}

//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//
//        }
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int val = 7;
//        boolean found = false;
//        for (int num : numbers){
//            if (num == val){
//                found = true;
//                break;
//            }
//        }
//        if (found){
//            System.out.println(val);
//        }
        int val = 7;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == val) {
                break;
            }
        }
        System.out.println(val);


    }

}