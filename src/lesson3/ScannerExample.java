package lesson3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input name");
        String name = scanner.nextLine();
        System.out.println("please input surname");
        String surname = scanner.nextLine();
        System.out.println("Welcome " + name + " " + surname);
        System.out.println("please input name father ");
        String namefather = scanner.nextLine();


    }
}
