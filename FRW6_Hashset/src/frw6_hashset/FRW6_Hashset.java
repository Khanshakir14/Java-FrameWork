/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frw6_hashset;
import java.util.*;
//Set means it doesn't allow duplicates
//hash means it uses Hash Table

//by default:
//The initial capacity will be of 16
//The loading factor will be 0.75

//we should be careful while choosing hashset, because it would waste atleast 25% of space so that to achieve time complexity of O(1) the operations
//you should know your requirement and select suitable data structure
public class FRW6_Hashset {

    
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>(List.of(40,50,60));
       
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        
        hs.addAll(hs2);
        
        //duplicate elements are removed
        //The order followed may not be that we have written above
        System.out.println(hs);
    }
    
}
