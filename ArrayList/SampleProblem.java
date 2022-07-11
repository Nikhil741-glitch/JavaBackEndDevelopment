package ArrayList;

/*
 * Problem: Given an array of N integers and a value K. The task is to 
 * return a list of integers from the given array whose value is less than K.
 */
import java.util.*;

public class SampleProblem {
    
    static List<Integer> getSmaller(int arr[], int k)
    {
        List<Integer> al = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < k)
                al.add(arr[i]);
        }
        
        return al;
    }
    
    public static void main (String[] args) {
        
        // Create a ArrayList
        int arr[] = {10, 40, 80, 30, 20, 15};
        
        List<Integer> al = getSmaller(arr, 30);
        
        for(Integer x: al)
            System.out.println(x);
    }
}
