package homework.homework6.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray diarray = new DynamicArray();
        int[] array ={15,1,5,6,8,25,85,69,42,10};
        for(int number  : array) {
            diarray.add(number);
        }



        System.out.println("Տպում ենք մասիվի ավելացված էլեմենտները");
        diarray.print();
        // Ստուգում ենք getByIndex()
        System.out.println("element index 3" + diarray.getByIndex(3));
        System.out.println("element index 11" + diarray.getByIndex(11));
    }

}
