package lesson13.fileExample.serialization;

import java.io.*;

public class SerializationDemo {

    private static  final String FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\lesson13\\myfile.text";
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Student student = new Student("poxos","poxosyan",21,"poxos@mail,com");
//
//        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))){
//            objectOutputStream.writeObject(student);
//        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))){
            Object object = objectInputStream.readObject();
            if(object instanceof Student student){
               // Student student = (Student) object;
                System.out.println(student);
            }

        }

    }
}
