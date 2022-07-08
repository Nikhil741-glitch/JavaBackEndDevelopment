package Collection;
//This example illustrates the working of Wildcards in Generics.
// Also we understand that although Student is the parent of EnggStudent and MgmtStudent, 
//but ArrayList is not the parent/ancestor of ArrayList and ArrayList.
import java.util.*;

// Parent class
class Student
{
    void print()
    {
        System.out.println("Student");
    }
}

// Descendant class of Student
class EnggStudent extends Student
{
    void print()
    {
        System.out.println("EnggStudent");
    }
}

// Descendant class of Student
class MgmtStudent extends Student
{
    void print()
    {
        System.out.println("MgmtStudent");
    }
}
public class WildCard {
    // Wildcard to specify any ArrayList
    // of class Student or its descendant can 
    // be passed into this
    // general purpose function
    static void printStudents(
        ArrayList<? extends Student> al)
    {
        for (Student s: al)
            s.print();
    }
    
    // Main function 
    public static void main (String[] args) {
        // Creating ArrayList of EnggStudent
        ArrayList<EnggStudent> al1 = new ArrayList<>();
        
        // Adding EnggStudent to al1
        al1.add(new EnggStudent());
        al1.add(new EnggStudent());
        
        // Creating ArrayList of MgmtStudent
        ArrayList<MgmtStudent> al2 = new ArrayList<>();
        
        // Adding MgmtStudent to al2
        al2.add(new MgmtStudent());
        
        // Calling the general purpose StringIndexOutOfBoundsException
        printStudents(al1);
        printStudents(al2);
    }
}

/*
Let's understand the implementation of inheritance before proceeding with the Wildcards in Generics.

class Student
{
....
}
class EnggStudent extends Student
{
....
}

class Test
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        EnggStudent s2 = new EnggStudent();
        s1 = s2;
    }
}
 */

 /*
-----------------------------------------------------------
Let's modify the above code using collection and generics.
-----------------------------------------------------------
class Student
{
....
}
class EnggStudent extends Student
{
....
}

class Test
{
    public static void main(String args[])
    {
        ArrayList<Student> al1 = new ArrayList<Student>();
        ArrayList<EnggStudent> al2 = new ArrayList<EnggStudent>();
        al1 = al2;
    }
}

  */

/*
-----------------------------------------------------------
Now let's look at the same example using Wildcards in generics.
-----------------------------------------------------------

class Student
{
....
}
class EnggStudent extends Student
{
....
}

class Test
{
    public static void main(String args[])
    {
        ArrayList<?> al1 = new ArrayList<>();
        ArrayList<EnggStudent> al2 = new ArrayList<EnggStudent>();
        al1 = al2;
    }
}
 */

 /*
--------------------------------------------------------
Now instead of making the ArrayList as such that any type can be assigned to it, 
we can bound the ArrayList to only accept the Student or any descendants of Student class.
This can be done by using the extends keyword. 
This is also called as the Upper Bounded Wildcards and is done by using extends keyword.
--------------------------------------------------------
class Student
{
....
}
class EnggStudent extends Student
{
....
}

class Test
{
    public static void main(String args[])
    {
        ArrayList<? extends Student> al1 = new ArrayList<>();
        ArrayList<EnggStudent> al2 = new ArrayList<EnggStudent >();
        al1 = al2;
    }
}
  */

/*
-------------------------------------------------------------
In addition to this, we can also bound an ArrayList from the lower side using the super keyword.
-------------------------------------------------------------
class Student
{
....
}
class EnggStudent extends Student
{
....
}

class Test
{
    public static void main(String args[])
    {
        ArrayList<? super Student> al1 = new ArrayList<>();
        ArrayList<Object> al2 = new ArrayList<>();
        al1 = al2;
    }
}
*/

/*
public interface Collection<E> extends Iterable<E>
{
    int size();
    boolean isEmpty();
    boolean contains();
    boolean add(E e);
    boolean remove(Object 0);
    Iterator<E> iterator();
    Object toArray();
    T[] toArray(T[] arr);
    Stream<E> stream();
    Stream<E> parallelStream();
    
    // Bulk Operations
    boolean containsAll(Collection<?> c)
    boolean addAll(Collection<? extends E> c)
    boolean removeAll(Collection<?> c)
    boolean removeIf(Predicate<? super E> filter)
}
*/

