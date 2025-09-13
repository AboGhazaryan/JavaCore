package homework2.Homework2;

public class FigurePainter {
    public static void main(String[] args) {
        int a = 6;
        for (int b = 0; b < a; b++) {
            for (int c = 0; c < b; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        for (int s = 5; s > 0; s--) {
            for (int d = 0; d < s; d++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println();

        for (int f = 5; f > 0; f--) {
            for (int i = 1; i < f ; i++) {
                System.out.print("  ");
            }
            for (int i = 6; i > f ; i--) {
                System.out.print("* ");
                
            }
            System.out.println();

        }
        System.out.println();

        for (int n = 1; n < 6; n++) {
            for (int m = 1; m < n ; m++) {
                System.out.print("  ");
            }
            for (int m = 6; m > n ; m--) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println();

        for (int z = 5; z > 0 ; z--) {
            for (int x = 1; x < z ; x++) {
                System.out.print(" ");
            }
            for (int x = 6; x > z; x--) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int t = 1; t < 6 ; t++) {
            for (int y = 1; y < t; y++) {
                System.out.print(" ");
            }
            for (int y = 6; y > t; y--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}






