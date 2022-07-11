package ArrayList;
import java.util.*;

//Forward Traversal using ListIterator:

public class IteratorList {
    public static void main (String[] args) {
        
        // Create a List
        List<Integer> list = new ArrayList<Integer>();
    
        // Add element to List
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Iterator pointing to position just before 
        // first element
        ListIterator<Integer> it = list.listIterator();
        
        // While there is a next element of the 
        // current iterator
        while(it.hasNext())
        {   
            // Print the next element and increment
            // iterator by one position
            System.out.println(it.next());
        }
    }
}

/*
 * --------------------------------------------------------
 * Backward Traversal using ListIterator: 
 * -------------------------------------------------------
 
 import java.util.*;

class Gfg{
    public static void main (String[] args) {
        
        // Create a List
        List<Integer> list = new ArrayList<Integer>();
    
        // Add element to List
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Iterator pointing to position just after 
        // last element
        ListIterator<Integer> it = list.listIterator(list.size());
        
        // While there is a previous element of the 
        // current iterator
        while(it.hasPrevious())
        {   
            // Print the previous element and decrement
            // iterator by one position
            System.out.println(it.previous());
        }
    }
}

 */

 /*
  * -----------------------------------------------
Example of set() method: 
  -------------------------------------------------
  import java.util.*;

class Gfg{
    public static void main (String[] args) {
        
        // Create a List
        List<Integer> list = new ArrayList<Integer>();
    
        // Add element to List
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Iterator pointing to position just after 
        // last element
        ListIterator<Integer> it = list.listIterator(list.size());
        
        // While there is a previous element of the 
        // current iterator
        while(it.hasPrevious())
        {   
            int x = (Integer)it.previous();
            
            // Replaces last element returned by previous()
            // everytime with double of its value.
            it.set(x*2);
        }
        
        // Print list
        System.out.println(list);
        
    }
}

  
  */

  /*
   * ---------------------------------------------
   * add() method:
   * ---------------------------------------------
   import java.util.*;

class Gfg{
    public static void main (String[] args) {
        
        // Create a List
        List<Integer> list = new ArrayList<Integer>();
    
        // Add element to List
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Iterator pointing to position just before 
        // first element
        ListIterator<Integer> it = list.listIterator();
        
        // While there is a next element of the 
        // current iterator
        while(it.hasNext())
        {   
            // Adds an element 5 just before the 
            // current iterator position
            it.add(5);
            
            // Increments iterator one position ahead
            it.next();
        }
        
        // Print list
        System.out.println(list);
        
    }
}

*/