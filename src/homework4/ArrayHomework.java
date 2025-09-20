package homework4;

public class ArrayHomework {
    public static void main(String[] args) {
        // 1
        int[] numbers = {1, 5, 6, 6, 7, 55, 9, 3, 15, 77};
        {
            int n = 6;
            {

                int quantity = 0;
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] == n) {
                        quantity++;
                    }
                }
                System.out.print("Variable: " + quantity);
            }
            System.out.println();
            //2
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.print(numbers[i] + " ");

            }
            System.out.println();
            //3
            boolean[] checked = new boolean[numbers.length];
            int repeatedCount = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (checked[i]) {
                    continue;
                }
                int count = 1;
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                        checked[j] = true;
                    }
                }
                if (count > 1) {
                    repeatedCount++;
                }
            }
            System.out.print("repeated number: " + repeatedCount);


        }
        System.out.println();
        //4
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        {
            int vowelCount = 0; //ձայնավորների քանակը։

            for (int i = 0; i < chars.length; i++) {
                char ch  = chars[i];
                if (ch =='ա' || ch == 'ե' || ch == 'ը' ||  ch == 'ի' || ch == 'ո' || ch == 'օ'  || ch == 'է'    ){
                    vowelCount++;

                }
            }
            System.out.print( "vowelCount: " + vowelCount);
        }


    }


}
