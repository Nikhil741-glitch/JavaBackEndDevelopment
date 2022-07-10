package StreamInJava;
/*
 * Example 8: Program to create the group of students according to the marks.
 */

import java.util.*;
import java.util.stream.*;

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
public class Example8 {
    public static void main (String[] args) {
        
        // Arrays of Student type
        Student arr[] = { new Student(110, "abc", 70), 
                          new Student(101, "bcd", 70),
                          new Student(120, "xyz", 60) };
        
        // Creating a map where marks are the keys
        // and students for every marks
        // here students are grouped according
        // to the marks
        Map<Integer, List<Student>> m = Arrays.stream(arr).collect(Collectors.groupingBy(Student::getMarks));
        
        System.out.println(m);
    }
}
