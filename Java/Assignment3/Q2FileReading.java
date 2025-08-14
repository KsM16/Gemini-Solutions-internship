package Assignment3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Q2FileReading {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        // input path of file
        String fileName = sn.nextLine();

        try{

            Path path = Paths.get(fileName);
            List<String> content = Files.readAllLines(path);
            HashMap<String, Integer> map = new HashMap<>();
            for (String line : content){

               String tempString = line.toLowerCase();
               // splitting the words by whitespace characters

               String[] words = tempString.split("\\s+");
               for (String word : words){
                   if (!word.isEmpty()){
                       map.put(word, map.getOrDefault(word,0)+1);
                   }

               }

            }
            PriorityQueue<Map.Entry<String,Integer>> minHeap =
                    new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
            for (Map.Entry<String,Integer> entry : map.entrySet()){
                minHeap.offer(entry);
                if (minHeap.size()>5){
                    minHeap.poll();
                }
            }
            List<Map.Entry<String,Integer>> result = new ArrayList<>(minHeap);
            result.sort((e1,e2) -> e2.getValue() - e1.getValue());
            System.out.println("5 most frequent words : ");
            for (Map.Entry<String,Integer> entry : result){
                System.out.println( entry.getKey() +":"+ entry.getValue());
            }



        } catch (IOException e) {
            System.err.println("File cannot be read");
        }
    }
}
