package StreamInJava;

/*
 * Example 3: Using Stream to find the average of an array. DoubleStream average() returns an OptionalDouble describing the 
 * arithmetic mean of elements of this stream, or an empty optional if this stream is empty.

 */
import java.util.*;
public class Example3 {
    public static void main (String[] args) {
        int arr[] = {30, 20, 10};
        
        // The average() returns an optional double 
        // getAsDouble() gets the double from the 
        // optional double
        double avg = Arrays.stream(arr)
                        .average()
                        .getAsDouble();
        
        // Displaying the average
        System.out.println(avg);
    }
}
