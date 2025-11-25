package homework.homework11;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileAnalyzer {


    public Map<String, Integer> wordMap(String path) throws IOException {
        // Читаем файл, составляем мапу слово-количество и возвращаем ее
        Map<String, Integer> resultMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (resultMap.containsKey(word)) {
                        resultMap.put(word, resultMap.get(word) + 1);
                    } else {
                        resultMap.put(word, 1);
                    }
                }

            }
        }
        return resultMap;

    }

    public int totalWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем общее количество слов
        Map<String, Integer> stringIntegerMap = wordMap(path);
        int sum = 0;
        for (Integer value : stringIntegerMap.values()) {
            sum = sum + value;
        }


        return sum;
    }

    public int uniqueWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем количество уникальных слов
        Map<String, Integer> stringIntegerMap = wordMap(path);
        return stringIntegerMap.size();

    }

    public Map<String, Integer> topFrequentWords(String path, int n) throws IOException {
        // Читаем файл, находим топ-N часто встречающихся слов

        Map<String, Integer> wordMap = wordMap(path);
        Set<Map.Entry<String, Integer>> entries = wordMap.entrySet();
        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(entries);
        Collections.sort(entryList,new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        int length = Math.min(entryList.size(),n);
        Map<String,Integer> topMap = new LinkedHashMap<>();
        for (int i = 0; i < length; i++) {

            Map.Entry<String,Integer> entry = entryList.get(i);
            topMap.put(entry.getKey(),entry.getValue());
        }


        return topMap;
    }

    public int countWordOccurrences(String path, String word) throws IOException {
        // Читаем файл, находим количество вхождений слова и возвращаем это число

        return wordMap(path).getOrDefault(word,0);
    }

}
