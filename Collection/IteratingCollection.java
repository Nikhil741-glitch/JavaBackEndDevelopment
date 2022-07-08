package Collection;
import java.util.*;

//ForEach Loop

public class IteratingCollection {
    public static void main (String[] args) {
        // ArrayList containing elements
        List<Integer> al 
        = Arrays.asList(
            10, 20, 5, 3, 40);
        
        // for-each loop to traverse through
        for(Integer x: al)
            System.out.print(x + " ");
    }
}

/*
-----------------------------------------------------------
 * ForEach Method
-----------------------------------------------------------

 // Traverssing a collection using 
// forEach() method
import java.util.*;

class GFG
{
    public static void main (String[] args) {
        // ArrayList containing elements
        List<Integer> al 
        = Arrays.asList(
            10, 20, 40, 5);
        
        // Using forEach() method to traverse
        al.forEach(x -> System.out.println(x));

        // The above expression can be replaced
        // by a Method reference
        // al.forEach(System.out::println);
    }
}

 */

 /*

 ------------------------------------------------------------

  * Traversing a collection using a Stream method. Introduced in Java 8, the Stream API is used to process collections of objects. 
  A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
 ----------------------------------------------------------------

  // Traversing a collection using 
// stream() method
import java.util.*;

class GFG
{
    public static void main (String[] args) {
        // ArrayList containing elements
        List<Integer> al 
        = Arrays.asList(
            10, 15, 7, 20, 40); 
        
        // Using stream to traverse and
        // print elements with a space
        al.stream()
          .forEach(x -> System.out.print(x + " "));
          
        System.out.println();
        
        // First creating a stream over the ArrayList
        // Filtering the elements greater than 10
        // Filtering the even elements
        // Printing the list with space
        al.stream()
          .filter(x -> x > 10)
          .filter(x -> x % 2 == 0)
          .forEach(x -> System.out.print(x + " "));
    }
}

  */
  