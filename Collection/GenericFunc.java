package Collection;
public class GenericFunc {
    // Declaration of generic function
    // Type parameters defined before 
    // return type
    public static<T> int count(T arr[], T x)
    {
        int res = 0;
        
        // Traverse the array
        for(T e: arr)
        {
            if (e.equals(x))
                res++;
        }
        return res;
    }
    public static void main(String[] args) 
    { 
        Integer arr[] = {10, 20, 30, 40, 10, 30};
        System.out.println(count(arr, 10));
    } 
}
/*

-------------------------------------------------------
CompileTime ERROR
-------------------------------------------------------


// Using generics converts run time exceptions   
// into compile time exception. 
import java.util.*; 

// Generic class
class Pair<T, S> {
    T x;
    S y;
}
class Test 
{ 
    public static void main(String[] args) 
    { 
        // Creating object of generic class
        Pair<Integer, String> p = new Pair<Integer, String>();
        
        // Compiles fine because
        // p being an object accepts integer
        p.x = 12;
        
        // Compiles fine because
        // p being an object accepts string
        p.y = "GfG";
        
        // This shows compiler error
        // as p.x was an integer and cannot be
        // casted to a string
        String str = (String) p.x;
    } 
} 

 */

 /*
 -------------------------------------------------------
RunTime ERROR
-------------------------------------------------------


 // A Simple Java program to demonstrate that NOT using 
// generics can cause run time exceptions 
import java.util.*; 

// Object class
class Pair {
    Object x;
    Object y;
}
class Test 
{ 
    public static void main(String[] args) 
    { 
        Pair p = new Pair();
        
        // Compiles fine because
        // p being an object accepts integer
        p.x = 12;
        
        // Compiles fine because
        // p being an object accepts string
        p.y = "GfG";
        
        // This throws a ClassCastException
        // as p.x was an integer and cannot be
        // casted to a string
        String str = (String) p.x;
    } 
} 
*/

/*
-------------------------------------------------------
  Guess The OutPut Of this CODE :
-------------------------------------------------------

// Java code to demonstrate working of
// generic function
import java.util.*; 

// Generic class
class MyGen<T> {
    T x;
    static int count;
    MyGen()
    {
        count++;
    }
}
class Test 
{ 
    public static void main(String[] args) 
    { 
        // Creating object of generic class
        MyGen<Integer> m1 = new MyGen<>();
        
        // Creating object of a generic class
        MyGen<Integer> m2 = new MyGen<>();
        
        System.out.println(MyGen.count);
    } 
} 
*/
