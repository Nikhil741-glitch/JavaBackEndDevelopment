package LambdaExpression;


/*
 * Using lambda expressions to sort an array of points according to the x-coordinates.
 */

 // Java code to sort the array according
// to x-coordinate using the lambda expression
import java.util.*;

// Point class which does not implement
// Comparable interface. Thus the objects
// of this class are not comparable.
class Point
{
    int x, y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
public class LamBdaParameters {
    public static void main (String[] args) {
        
        // Arrays of Point types
        Point arr[] = { new Point(10, 20), 
                        new Point(5, 30), 
                        new Point(30, 40) };
                        
        // Arrays.sort() is called and the array is 
        // passed alongside lambda expression
        // The lambda expression implements compare() 
        // method of Comparator interface
        Arrays.sort(arr, (p1, p2)->p1.x - p2.y);
        for(int i = 0; i<arr.length; i++)
            System.out.println(arr[i].x + " " + arr[i].y);
    }
}

/*
 * -------------------------------------------------------------
 * Example 3: This illustrates the Type 3 Lambda expression with multiparameters.
----------------------------------------------------------------

// Java code to illustrate lambda expression
// with single parameter

// functional interface Test3
// with 2 parameter of Integer type
interface Test3
{
    // The void type and the Integer type
    // is automatically inferred from here
    // and assigned to the lambda expression
    void print(Integer p1, Integer p2);
}

class GfG
{
    // takes parameter of Test3 type followed
    // by 2 integer parameters p1 and p2
    static void fun(Test3 t, Integer p1, Integer p2)
    {
        // calls the print function
        t.print(p1, p2);
    }
    public static void main (String[] args) {
        // lambda expression is passed 
        // with two parameters 
        // lambda expression is mapped to the 
        // double argument abstract function in the
        // functional interface Test3
        fun(
            (p1, p2)->System.out.println(p1 + " " + p2),
            10, 20);
    }
}

 */

 /*
  * ---------------------------------------------------------
Example 2: This illustrates the Type 2 Lambda expression with single parameter.
  -----------------------------------------------------------

  // Java code to illustrate lambda expression
// with single parameter

// functional interface
// with one parameter of Integer type
interface Test2
{
    // The void type and the Integer type
    // is automatically inferred from here
    // and assigned to the lambda expression
    void print(Integer p);
}

class GfG
{
    // takes lambda expression and a variable of
    // Integer type as arguments
    static void fun(Test2 t, Integer p)
    {
        // calls the print function
        t.print(p);
    }
    public static void main (String[] args) {
        // lambda expression is passed 
        // with a single parameter
        // lambda expression is mapped to the 
        // single argument abstract function in the
        // functional interface Test2
        fun(p->System.out.println(p), 10);
    }
}

  */

  /*
   * -----------------------------------------------------------------
   * Example 1: This illustrates the Type 1 Lambda expression with no parameters.
   * -----------------------------------------------------------------
   
   // Java code to illustrate lambda expression
// without parameters

// functional interface
// without parameters
interface Test1
{
    void print();
}

class GfG
{
    // functional interface parameter is passed
    static void fun(Test1 t)
    {
        t.print();
    }
    public static void main (String[] args) {
        // lambda expression is passed 
        // without parameter to functional interface t 
        fun(()->System.out.println("Hello"));
    }
}

   */