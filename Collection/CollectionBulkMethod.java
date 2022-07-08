package Collection;
import java.util.*; 

//ContainsAllMethod

public class CollectionBulkMethod {
    public static void main(String args[]) 
    { 
        // Creating an empty list 
        List<Integer> list1 = new ArrayList<Integer>(); 

        // Use add() method to add elements 
        // into the List 
        list1.add(10); 
        list1.add(20); 
        list1.add(30); 

        // Creating another empty List 
        List<Integer> list2 = new ArrayList<Integer>(); 
        
        // Adding elements to list2
        list2.add(10); 
        list2.add(30); 
        
        // Returns true if all the elements of list2
        // is present in list1 or not
        System.out.println(list1.containsAll(list2)); 
    } 
}

/*
 * addAllMethod

// Java program to illustrate 
// boolean addAll(Collection c) 
import java.util.*; 

class GfG { 
    public static void main(String args[]) 
    { 

        // create an empty array list1
        List<Integer> list1 = new ArrayList<Integer>(); 

        // use add() method to add elements in the list1 
        list1.add(10); 
        list1.add(20); 
        list1.add(30); 

        // create an empty array list2
        List<Integer> list2 = new ArrayList<Integer>(5); 

        // use add() method to add elements in list2 
        list2.add(40); 
        list2.add(50); 

        // inserting all elements, list2 will get printed 
        // after list1 
        list1.addAll(list2); 

        System.out.println(list1); 
    } 
} 
*/

/*
RemoveAllMethod

// Java program to demonstrate 
// removeAll() method
import java.util.*; 

public class GFG1 { 
    public static void main(String[] argv)
    { 

        // Creating object of ArrayList<Integer> 
        List<Integer> list1 = new ArrayList<Integer>(); 

        // Populating list1 
        list1.add(10); 
        list1.add(20); 
        list1.add(30); 

        // Creating another object of ArrayList<Integer> 
        List<Integer> list2 = new ArrayList<Integer>(); 
        
        // Populating list1 
        list2.add(10); 
        list2.add(20); 

        // Removing elements from list1 
        // specified in list2 
        // using removeAll() method 
        list1.removeAll(list2); 

        // print list1 
        System.out.println(list1); 
    } 
} 
*/

/*
 * RetainAllMethod
 * 
 * // Java program to demonstrate 
// retainAll() method
import java.util.*; 

public class GFG1 { 
    public static void main(String[] argv)
    { 

        // Creating object of ArrayList<Integer> 
        List<Integer> list1 = new ArrayList<Integer>(); 

        // Populating list1 
        list1.add(10); 
        list1.add(20); 
        list1.add(30); 

        // Creating another object of ArrayList<Integer> 
        List<Integer> list2 = new ArrayList<Integer>(); 
        
        // Populating list1 
        list2.add(10); 
        list2.add(20); 

        // Retains elements of list1 
        // specified in list2 
        // using retainAll() method 
        list1.retainAll(list2); 

        // print list1 
        System.out.println(list1); 
    } 
} 

 */

 /*
  * RemoveIf

  // Java Program Demonstrate  
// removeIf() method 
import java.util.*; 
public class GFG { 

    public static void main(String[] args) 
    { 

        // create an ArrayList which going to 
        // contains a list of Numbers 
        List<Integer> list1 = new ArrayList<Integer>(); 

        // Add Number to list 
        list1.add(10); 
        list1.add(15); 
        list1.add(30); 
        list1.add(19); 

        // applying removeIf() method 
        // we are going to remove
        // the even numbers
        // Here we have used a lambda expression
        // to check for even numbers
        list1.removeIf(n -> (n % 2 == 0)); 
        
        System.out.println(list1); 
    } 
} 

  */

  
