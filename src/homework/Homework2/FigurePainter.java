package homework.Homework2;

public class FigurePainter {
    public static void main(String[] args) {

        for (int f = 0; f < 5; f++) {
            for (int i = 4; i > f; i--) {
                System.out.print("");
            }
            for (int i = 0; i <= f; i++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println();

        for (int n = 1; n < 6; n++) {
            for (int m = 1; m < n; m++) {
                System.out.print("");
            }
            for (int m = 6; m > n; m--) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println();

        for (int z = 5; z > 0; z--) {
            for (int x = 1; x < z; x++) {
                System.out.print("  ");
            }
            for (int x = 6; x > z; x--) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();

        for (int t = 1; t < 6; t++) {
            for (int y = 1; y < t; y++) {
                System.out.print("  ");
            }
            for (int y = 6; y > t; y--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        for (int x = 5; x > 0; x--) {
            for (int y = 1; y < x ; y++) {
                System.out.print(" ");

            }
            for (int i = 6; i > x; i--) {
                System.out.print("* ");

            }
            System.out.println();

        }

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i ; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
}









