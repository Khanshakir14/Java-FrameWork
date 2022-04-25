/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frw2_linkedlistclass;
import java.util.*;
//Java uses LinkedList Class which uses Doubly LinkedList
/**
 *
 * @author shaha
 */
public class FRW2_LinkedListClass {

    public static void main(String[] args) {
       LinkedList<Integer> Ll1 = new LinkedList<>();  //Arralist class  + some extra things
       LinkedList<Integer> Ll2 = new LinkedList<>(List.of(50,60,70,80));
       
       Ll1.add(10);
       Ll1.add(0,5);
       Ll1.addAll(1,Ll2);
       Ll1.add(5,70);
       
       Ll1.set(6,10);
       Ll1.addFirst(3);
       Ll1.addLast(200);
       
       System.out.println("The Element at the index 2 is "+Ll1.get(2)+".");
      
      System.out.println("The first element in the linked list is "+Ll1.peek()+".");
       
       Ll1.forEach(n->show(n));
       
       
       
    }
    static void show(int n){
       
            System.out.println(n);
    }
}
