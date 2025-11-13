package lesson13.fileExample.ioExample;

import java.io.*;

public class FileReadAndWrite {
    private static final String FILE_PATH ="C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\lesson13\\myfile.text";

    public static void main(String[]args) throws IOException {
       // write();
        read();
    }

    public static void write() throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH));
        for (int i = 0; i < 100; i++) {
            bw.write("Hello");
            bw.newLine();
        }
        bw.close();
    }

    public static void read(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))){
            String line = "";
            int lineNumber = 1;
            while ((line = bufferedReader.readLine()) != null ){
                System.out.println(lineNumber++ +" " + line);
            }

//            int c;
//            while ((c = bufferedReader.read()) != -1){
//                System.out.print((char) c);
//            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
