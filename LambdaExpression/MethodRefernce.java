package LambdaExpression;
import java.util.*;

/*
 * Comparing two strings using the Arrays.equals() method and 
 * passing the Method reference as the Comparator interface to ignoring the cases while comparison. 
 * The Comparator is a functional interface. 4
 * Therefore using this we don't need to create a separate class or instance, instead, 
 * we can simply pass a lambda expression or a method reference to make the operation run. 
 * Java String compareToIgnoreCase() method is much similar to equals() method, except that case is ignored.
}
*/

public class MethodRefernce {
    public static void main(String args[])
    {
        // Arrays of Strings
        String a[] = {"GfG", "IDE", "Courses"};
        String b[] = {"gfg", "ide", "courses"};
        
        // equals() method to compare ignoring
        // the cases
        // Third parameter is a comparator using
        // which we can define the basis of comparison
        if(Arrays.equals(a, b,String::compareToIgnoreCase))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

/*
----------------------------------------------------------------------
*Example 3: Working of Method reference in the case of a static method.
----------------------------------------------------------------------

 // Java code to illustrate method reference
// using a static method
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        // ArrayList to check the function
        List<Integer> al 
        = Arrays.asList(10, 20, 7, 8);
        
        // forEach() method takes the method reference
        // Being a static method, its reference can
        // be passed using the class name
        al.forEach(GfG::printSquare);
    }
    
    // Static method 
    public static void printSquare(Integer x)
    {
        System.out.println(x*x);
    }
}

 */

 /*
  * ------------------------------------------------------------
Example 2: The above method can be modified using method reference. 
When a lambda expression is simply used for a pass-through operation then it can be replaced by a method reference.
--------------------------------------------------------------

// Java code to illustrate method reference
// using instance method
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        // ArrayList to check the function
        List<Integer> al 
        = Arrays.asList(10, 20, 15, 16);
        
        // Method reference. Here the instance or
        // object method is passed hence the object 
        // name has been used
        al.forEach(System.out::println);
    }
}
*/

/*
 * --------------------------------------------------------------
 * Example 1: This illustrates the working of Lamba Expression by printing the elements inside a collection.

 * --------------------------------------------------------------

 // Java code to illustrate functional
// interface using lambda expression
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        // ArrayList to check the function
        List<Integer> al 
        = Arrays.asList(10, 20, 15, 16);
        
        // forEach() method takes the lambda expression
        // as it is a functional interface
        al.forEach(x -> System.out.println(x));
    }
}

 */