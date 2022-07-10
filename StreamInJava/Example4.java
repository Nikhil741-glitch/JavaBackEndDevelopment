package StreamInJava;
import java.util.stream.*;
/*
 * Example 4: Print first n natural numbers with given digit d.
 */
public class Example4 {
    public static void main (String[] args) {
        Stream.iterate(1, x -> x + 1)
              .filter(x -> x.toString().contains("5"))
              .limit(10)
              .forEach(System.out::println);
    }
}
