package lesson13;

import java.io.File;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\lesson13\\myfile.text");

//        File file1 = new File(file, "simon");
//        file1.mkdir();
//        System.out.println(File.separator);
//        if(file.isDirectory()){
//            File[ ] list = file.listFiles();
//            for (File s : list){
//                System.out.println(s.getName() + " isfile: " + s.isFile());
//            }
//        }
       // System.out.println(file.exists()); // true false
//        if(!file.exists()){
//            try {
//                System.out.println(file.createNewFile());  // new file
//            } catch (IOException e) {
//                System.out.println("can't create a file");;
//            }
//        }
//      //  file.delete();
//        System.out.println(file.isFile());
//
//        System.out.println(file.isDirectory());


        System.out.println(file.lastModified()); // long
        Date date = new Date(file.lastModified());
        System.out.println(date);
    }
}
