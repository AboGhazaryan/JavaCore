package homework.homework6.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray(20);
        for (int i = 0; i < 15; i++) {
            dy.add(i + 1);
        }
        System.out.println("print array elements");
        dy.print();
        System.out.println("element index 3: " + dy.getByIndex(3));
        System.out.println("element index 11: " + dy.getByIndex(11));
        System.out.println("ջնջել մասիվի index-երորդ էլեմենտը");
        dy.deleteByIndex(15);
        dy.print();
        System.out.println("value-ն տրված ինդեքսում ++,");
        dy.add(1, 50);
        dy.print();
        System.out.println("value == index");
        dy.set(5, 7);
        dy.print();
        System.out.println("value true|| false");
        System.out.println(dy.exists(5));
        System.out.println("index value");
        System.out.println(dy.getIndexByValue(50));
        System.out.println(dy.getIndexByValue(5));

    }

}
