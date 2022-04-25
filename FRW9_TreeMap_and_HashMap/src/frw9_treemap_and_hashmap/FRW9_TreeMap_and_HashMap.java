/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frw9_treemap_and_hashmap;
//So map basically gives key value pair
import java.util.*;
import java.util.Map.*;
public class FRW9_TreeMap_and_HashMap {

    
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        tm.put(4, "E");
       // tm.put(5, "F");
        tm.put(6,"G");
        
        
        
        System.out.println(tm.ceilingEntry(5).getValue()); //This will print the value which is nearest and greater than the given value
        System.out.println(tm.get(3));//This would print D
        
        Entry<Integer,String> e =tm.firstEntry();
        System.out.println(e.getKey()+" "+e.getValue());
        
        System.out.println(tm);
    }
    
}
