package StreamInJava;
/*
 * Example 5: Print strings that begin with "a" and ends with "c" in lexicographic order.
 */
import java.util.*;
public class Example5 {
    public static void main (String[] args) {
        // String array
        String arr[] = {"abc", "cde", "acd", 
        "aec", "xyz"};
        
        // filters the stream with integers
        // beginning with a and ending with c
        // Then sorts the stream
        Arrays.stream(arr)
              .filter(x -> x.startsWith("a"))
              .filter(x -> x.endsWith("c"))
              .sorted()
              .forEach(System.out::println);
    }
}
