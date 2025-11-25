package homework.homework11;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class FileAnalyzerDemo {

    public static void main(String[] args) throws IOException {

        FileAnalyzer fileAnalyzer = new FileAnalyzer();

        String path = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\homework\\homework11\\Test.txt";

        Map<String, Integer> stringIntegerMap = fileAnalyzer.wordMap(path);


        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + ": " + stringIntegerEntry.getValue());
        }

        System.out.println(fileAnalyzer.totalWordCount(path));

        System.out.println(fileAnalyzer.uniqueWordCount(path));

        Map<String, Integer> topMap = fileAnalyzer.topFrequentWords(path,1);
        for(Map.Entry<String,Integer>top : topMap.entrySet()){
            System.out.println(top.getKey() + ": " + top.getValue());
        }


        System.out.println(fileAnalyzer.countWordOccurrences(path, "manuk"));
    }
}
