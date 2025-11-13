package lesson13.fileExample.ioExample;

import java.io.*;

public class DataIoStream {

    private static final String FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\lesson13\\myfile.text";

    public static void main(String[] args) throws IOException {
         //write();
        read();
    }

    public static void write() {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH))) {
            out.writeInt(952);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_PATH))) {
            System.out.println(inputStream.readInt());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
