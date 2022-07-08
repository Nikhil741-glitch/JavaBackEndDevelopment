package Collection; 
import java.util.List; 
import java.util.ArrayList; 
public class ToARRAY {
    public static void main (String[] args) 
    { 
        // Creating a list of ArrayList
        List<Integer> list = new ArrayList<Integer>();
        
        // Being a collection we can also create a 
        // queue by just replacing the statement 
        // with this
        // Queue<Integer> q = new ArrayDeque<Integer>();
        
        // Adding elements to the ArrayList
        list.add(10); 
        list.add(15); 
        list.add(20); 
        
        // Converting the ArrayList to an array of
        // Object type
        Object[] arr = list.toArray(); 

        // Printing array of objects 
        for (Object x : arr) 
            System.out.println(x + " "); 
    } 
}

/*
----------------------------------------------------
Problem of Object[] toArray() Method.
----------------------------------------------------

// Java program to demonstrate working of 
// Object[] toArray() 
import java.io.*; 
import java.util.List; 
import java.util.ArrayList; 

class GfG 
{ 
    public static void main (String[] args) 
    { 
        // Creating a list of ArrayList
        List<Integer> list = new ArrayList<Integer>();
        
        // Being a collection we can also create a 
        // queue by just replacing the statement 
        // with this
        // Queue<Integer> q = new ArrayDeque<Integer>();
        
        // Adding elements to the ArrayList
        list.add(10); 
        list.add(15); 
        list.add(20); 
        
        // Here the Object[] type cannot be implicitly converted to
        // Integer[] type
        Integer[] arr = list.toArray(); 

        // Printing array of objects 
        for (Object x : arr) 
            System.out.println(x + " "); 
    } 
} 

 */

 /*
-------------------------------------------------------------------
Now let's look at the second version T[] toArray(T[]) which solves the above Problem of Object[] toArray() Method.
-------------------------------------------------------------------

// Java program to demonstrate working of 
// T[] toArray()
import java.io.*; 
import java.util.List; 
import java.util.ArrayList; 

class GfG 
{ 
    public static void main (String[] args) 
    { 
        // Creating a list of ArrayList
        List<Integer> list = new ArrayList<Integer>();
        
        // Adding elements to the ArrayList
        list.add(10); 
        list.add(15); 
        list.add(20); 
        
        // Converting an array of Integer type
        Integer[] arr = new Integer[list.size()];
        
        // Converts the list to array of type arr
        arr = list.toArray(arr);

        // Printing array of objects 
        for (Integer x : arr) 
            System.out.println(x + " "); 
    } 
} 

  */
