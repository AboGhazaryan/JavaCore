package chapter7.ClassBox1;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);
        // создать копию объекта mybox1

        double vol;
        //получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);

        // получитьобъем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);

        //получить объем куба
        vol = mycube.volume();
        System.out.println("Oбъeм куба равен " + vol);

        //получить объем клона
        vol = myclone.volume();
        System.out.println("Oбъeм клона равен " + vol);

    }
}
