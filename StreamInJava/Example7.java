package StreamInJava;
/*
 * Example 7: Program to collect the roll and name from an array of String type to a Map.

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
public class Example7 {
    public static void main (String[] args) {
        
        // Arrays of Student type
        Student arr[] = { new Student(110, "abc", 70), 
                          new Student(101, "bcd", 80),
                          new Student(120, "xyz", 60) };
        
        // Creating a map and loading it with 
        // roll no and name of the student using
        // the Collectors.toMap() method
        Map<Integer, String> m 
        = Arrays.stream(arr)
                .collect(Collectors.toMap(
                    Student::getRoll, Student::getName));
        
        System.out.println(m);
    }
}
