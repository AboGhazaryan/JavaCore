package chapter10.exception;

public class sorti {
    public static void main(String[] args) {

        int[] array = {4, 7, 1, 3, 9, 0, 2};

        {

            try {
                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = 0; j < array.length   ; j++) {
                        if (array[j] > array[j + 1]) {
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }
                for (int num : array)
                    System.out.print(num + " ");

            }catch (Exception e){
                System.out.println(" sxal  " + e);
            }

        }
    }
}