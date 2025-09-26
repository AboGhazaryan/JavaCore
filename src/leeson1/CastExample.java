package leeson1;

public class CastExample {
    public static void main(String[] args) {
        int a = 120;
        {
            byte b = (byte) a;
            System.out.println(a);
        }


        double t = 10.5;
        {
            int v = (int) t;
            System.out.println(v);
        }
        System.out.println();

        byte i = 40;
        {
            byte n = 50;
            byte k = 100;
            int d = i * n / k;
            System.out.println(d);
        }
        System.out.println();

        byte b = 50;
        {
            b = (byte) (b * 2);
            System.out.println(b);
        }


    }
}
