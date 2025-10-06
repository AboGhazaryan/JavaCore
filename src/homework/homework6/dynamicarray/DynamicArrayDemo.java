package homework.homework6.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        for (int i = 0; i < 10; i++) {
            dy.add(i + 1);
        }




        System.out.println("print array elements");
        dy.print();
        // Ստուգում ենք getByIndex()
        System.out.println("element index 3: " + dy.getByIndex(3));
        System.out.println("element index 11: " + dy.getByIndex(11));
    }

}
