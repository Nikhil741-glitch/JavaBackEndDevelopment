package StreamInJava;
/*Example 6: Print the average of 3 students marks in a class Student.*/
// Java code to find the average 
// of marks of students
import java.util.*;
class Student
{
    int roll;
    int marks;
    String name;
    
    // Constructor to assign values
    Student(int r, String n, int m)
    {
        roll = r;
        name = n;
        marks = m;
    }
    int getRoll()
    {
        return roll;
    }
    String getName()
    {
        return name;
    }
    int getMarks()
    {
        return marks;
    }
}
public class Example6 {
    public static void main (String[] args) {
        
        // Arrays of Student type
        Student arr[] = { new Student(110, "abc", 70), 
                          new Student(101, "bcd", 80),
                          new Student(120, "xyz", 60) };
        
        // Getting the average of the marks
        // Mapping each element to getMarks
        // Finding the average
        double res = Arrays.stream(arr)
                           .mapToInt(x -> x.getMarks())
                           .average()
                           .getAsDouble();
        
        System.out.println(res);
    }
}
