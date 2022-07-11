package ArrayList;
import java.util.*;;
public class MethodsOfAL {
    public static void main(String args[])
    {
        ArrayList<String> al = new ArrayList<>();

        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        System.out.println(al);
    }
}

/*
 * Remove
 * 
 * import java.util.*;

class Test{
    public static void main (String[] args) {
        
        // Create a ArrayList
        ArrayList<String> al = new ArrayList<String>();
    
        al.add("geeks");
        al.add("ide");
        al.add("courses");
    
        System.out.println(al.contains("ide"));
        al.remove(1);
        System.out.println(al.contains("ide"));
        
        al.remove("courses");
        System.out.println(al.contains("courses"));
    }
}

 */

 /*
  * Other Methods :

  import java.util.*;

class Test{
    public static void main (String[] args) {
        
        // Create a ArrayList
        ArrayList<Integer> al = new ArrayList<Integer>();
    
        al.add(10);
        al.add(20);
        al.add(10);
        al.add(30);
    
        System.out.println(al.get(1));
        al.set(1, 40);
        System.out.println(al.get(1));
        System.out.println(al.indexOf(10));
        System.out.println(al.lastIndexOf(10));
        System.out.println(al.indexOf(50));
    }
}
  */

  /*
   * Clear and Empty
   * 
   * import java.util.*;

class Test{
    public static void main (String[] args) {
        
        // Create a ArrayList
        ArrayList<Integer> al = new ArrayList<Integer>();
    
        al.add(10);
        al.add(20);
        al.add(10);
        al.add(30);
    
        System.out.println(al.isEmpty());
        al.clear();
        System.out.println(al.isEmpty());
    }
}

   */