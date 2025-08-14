/*
Q5. You are given a collection of records with duplicate entries.
Describe two ways to remove duplicates while maintaining order.
What are the trade-offs?

Solutions -
1. LinkedHashSet :  Efficient time complexity of O(1) but uses additional memory
2. Using stream : clean approach but Stream overhead results in relatively slow performance

*/
package Assignment3;

import java.util.*;
import java.util.stream.Collectors;

public class Q5DuplicatesRemoval {
    public static void main(String[] args) {
        List<String> duplicate = Arrays.asList("A", "B", "A", "C", "B", "A","D","C");

        // using LinkedHashSet
        HashSet<String> set = new LinkedHashSet<>(duplicate);
        List<String> noDuplicate1 = new ArrayList<>(set);
        System.out.println(noDuplicate1);

        // using streams
        List<String> noDuplicate2 = duplicate.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(noDuplicate2);
    }
}
