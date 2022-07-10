package LambdaExpression;
import java.util.*;
import java.util.function.Predicate; 

//Example 3: This is an efficient method to print the even number in an array using lambda expression

public class Lambda {
    // Take a Collection and a Predicate
    // Predicate helps in unit-testing
    // Collection can accept LinkedList,
    // ArrayList, Queue etc
    static void printCond(
        Collection<Integer> c, 
        Predicate<Integer> p)
    {
        // Traverse the Collection
        // Print only those elements which
        // pass the test
        for (Integer x: c)
            if(p.test(x))
                System.out.print(x + " ");
    }
    public static void main(String args[])
    {
        // ArrayList to check the function
        List<Integer> al = new ArrayList<>(Arrays.asList(10,5 , 20, 15, 30));
        
        // Passes the collection and a 
        // lambda expression which is a functional
        // interface
        // This lambda expression maps the test
        // function of abstract method
        printCond(al, x -> x%2 == 0);
    }
    
}

/*------------------------------------------------------------
Example 1: This is a naive method to print the even number in an array using a functional interface and not the lambda expression.
--------------------------------------------------------------

// Take a Collection and a Predicate
    // Predicate helps in unit-testing
    // Collection can accept LinkedList,
    // ArrayList, Queue etc
    static void printCond(
        Collection<Integer> c, 
        Predicate<Integer> p)
    {
        // Traverse the Collection
        // Print only those elements which
        // pass the test
        for (Integer x: c)
            if(p.test(x))
                System.out.print(x + " ");
    }
    public static void main(String args[])
    {
        // This class implements Predicate Interface
        class MyPredicateEven implements Predicate<Integer>
        {
            // The only abstract method
            // to return when the integer is even
            public boolean test(Integer x)
            {
                return(x%2 == 0);
            }
        } 
        
        // ArrayList to check the function
        List<Integer> al 
        = new ArrayList<>(
            Arrays.asList(
                10, 5, 20, 7, 30));
                
        // Passing the collection ArrayList 
        // and an object of MyPredicateEven class
        // Since the class MyPredicateEven implements
        // Predicate interface it can be passed as an object
        // to be assigned to a variable p of Predicate type
        printCond(al, new MyPredicateEven());
    }
*/

/*
 * -----------------------------------------------------------------
 * Example 2: This is a naive method to print the even number in an array using a functional interface and Anonymous classes but not Lambda Expression. 
 * In anonymous classes, no extra class name is needed and no objects are needed to be passed, instead, an instance is passed.
 *  This makes the code concise.
 * -----------------------------------------------------------------
 
 // Java code to illustrate functional
// interface without using Lambda Expression
import java.util.*;
import java.util.function.Predicate; 

class GfG
{
    // Take a Collection and a Predicate
    // Predicate helps in unit-testing
    // Collection can accept LinkedList,
    // ArrayList, Queue etc
    static void printCond(
        Collection<Integer> c, 
        Predicate<Integer> p)
    {
        // Traverse the Collection
        // Print only those elements which
        // pass the test
        for (Integer x: c)
            if(p.test(x))
                System.out.print(x + " ");
    }
    public static void main(String args[])
    {
        // An instance of Predicate type is created
        // Creating anonymous class with Predicate interface
        Predicate<Integer> MyPredEven 
        = new Predicate<Integer>()
        {
            public boolean test(Integer x)
            {
                return (x%2 == 0);
            }
        };
        
        // ArrayList to check the function
        List<Integer> al 
        = new ArrayList<>(
            Arrays.asList(
                10, 5, 20, 7, 30));
                
        // Passing the collection ArrayList 
        // and an object of MyPredicateEven class
        // Since the class MyPredicateEven implements
        // Predicate interface it can be passed as an object
        // to be assigned to a variable p of Predicate type
        printCond(al, MyPredEven);
    }
}

 */
