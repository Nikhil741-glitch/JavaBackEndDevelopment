package StreamInJava;
import java.util.*;

/*
 * Example 2: Using Stream to find the max of an array. The max() returns the maximum element of the stream. 
 * The method returns Optional instance. The getAsInt() method returns value If a value is present in OptionalInt object

 */
public class Example2 {
    public static void main (String[] args) {
        int arr[] = {30, 20, 10};
        
        // The max() returns an optional int
        // which is the type of the primitive array 
        // getAsInt() gets the integer from the 
        // optional int
        int sum = Arrays.stream(arr)
                        .max()
                        .getAsInt();
        
        // Displaying the sum
        System.out.println(sum);
    }
}
