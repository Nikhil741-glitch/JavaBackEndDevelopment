package StreamInJava;
/*
 * Example 1: Using Stream to find the sum of an array.
 * The stream does not take any extra space and hence is efficient and readable. 
 * The stream functions are recommended to write in separate lines.

 */
import java.util.*;
public class Example1 {
    public static void main (String[] args) {
        int arr[] = {30, 20, 10};
        
        // Converting arr to stream
        // Then finding sum of the stream
        int sum = Arrays.stream(arr)
                        .sum();
        
        // Displaying the sum
        System.out.println(sum);
    }
}
