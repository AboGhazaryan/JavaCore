package chapter8.Box;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("(Oбъeм weightbox равен " + vol);
        System.out.println("Bec weightbox равен " + weightbox.weight);
        System.out.println();

        //присвоить переменной ссылки на объект типа BoxWeight
        // ссылку на объект типа Вох
        plainbox = weightbox;
        vol = plainbox.volume(); //Верно, так как метод volume()
                                 //определен в классе Вох

        System.out.println("(Oбъeм plainbox равен " + vol);
    }
}
