/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frw7_treeset;
import java.util.*;
//This implementation provides guaranteed log(n) time cost for the basic operations(add,remove, and contains)
//Set means elements would be sorted
//Tree is a data structure used for searching operation
//this would give elements in sorted order which was not the case with the hashset
public class FRW7_TreeSet {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40));
        ts.add(25);
        
        System.out.println(ts.ceiling(55));//it will give the number equal to the number or nearest greater than it
        System.out.println(ts);
    }
    
}

/*
As we know that tree set implements collection interface, sorted set interface etc.
so we can use thier refernece but in that case we could only use the methods which are present in the interfaces
for example


SortedSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40));

it is something like base class pointer and derieved class object in c++


*/