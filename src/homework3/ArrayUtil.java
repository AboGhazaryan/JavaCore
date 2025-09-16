package homework3;

import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};{

            for (int i = 0; i < numbers.length; i++) { //Տպել բոլոր էլեմենտները իրար կողք, բաժանված պռաբելով։
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
            System.out.println("_______________________");
            System.out.println("print the first element of an array:  " + numbers[0]);   //Տպել մասիվի առաջին էլեմենտը
            System.out.println("print the last element of an array:  " + (numbers.length - 1));//Տպել մասիվի վերջին էլեմենտը
            System.out.println("print array length: " + numbers.length);//Տպել մասիվի երկարությունը

            int min = numbers[0];              //Տպել մասիվի ամենափոքր թիվը
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
            System.out.println("minimum element is: " + min);


            int middle = numbers.length / 2;
            System.out.println("print the middle number of the array:  " + numbers[middle]);//Տպել մասիվի մեջտեղի թիվը
            if (numbers.length <= 2)
                System.out.println("can't print middle values.");
            if (numbers.length % 2 == 0)
                System.out.println("Middle values " + numbers[middle - 1] + "," + numbers[middle]);
            if (numbers.length % 2 == 1);
            System.out.println( numbers[middle]);

            int counter = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0){
                    counter++;
                }

            }
            System.out.println( "print the number of pairs numbers in the array:  " + counter );

            int counter1 = 0 ;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0){
                    counter1++;
                }

            }
            System.out.println("print the number of odd numbers in the array:  " + counter1);

            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum = sum + numbers[i];
            }
            System.out.println("print the sum of the elements in an array: " + sum);

            double average =(double) sum / numbers.length;
            System.out.println("print the arithmetic mean of an array: " + average);











        }


    }
}
