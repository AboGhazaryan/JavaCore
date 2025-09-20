package homework3;

import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        {

            for (int i = 0; i < numbers.length; i++) { //Տպել բոլոր էլեմենտները իրար կողք, բաժանված պռաբելով։
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
            System.out.println("_______________________");
            System.out.println("print the first element of an array:  " + numbers[0]);   //Տպել մասիվի առաջին էլեմենտը
            System.out.println("print the last element of an array:  " + (numbers.length - 1));//Տպել մասիվի վերջին էլեմենտը
            System.out.println("print array length: " + numbers.length);//Տպել մասիվի երկարությունը

            int min = numbers[0];              //Տպել մասիվի ամենափոքր թիվը
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
            System.out.println("minimum number is: " + min);


            int middle = numbers.length / 2;
            System.out.println("print the middle number of the array:  " + numbers[middle]);//Տպել մասիվի մեջտեղի թիվը
            if (numbers.length > 2){
                if (numbers.length <= 2)
                    if (numbers.length % 2 != 0){
                        System.out.println("Middle values " + numbers[numbers.length / 2]);
                    } else {
                        if (numbers.length % 2 == 0) ;
                        System.out.println("middle " + numbers[numbers.length / 2 - 1] + ", " + numbers[numbers.length / 2]);
                    }

            } else {
                System.out.println("can't print middle values");
            }


            int evencount = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    evencount++;
                }

            }
            System.out.println("print the number of pairs numbers in the array:  " + evencount);

            int oddcount = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    oddcount++;
                }

            }
            System.out.println("print the number of odd numbers in the array:  " + oddcount);

            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum = sum + numbers[i];
            }
            System.out.println("print the sum of the elements in an array: " + sum);

            double average = (double) sum / numbers.length;
            System.out.println("print the arithmetic mean of an array: " + average);


        }


    }
}
