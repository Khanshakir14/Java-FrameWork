/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frw2_arraydequeueclass;
import java.util.*;

//Stack is a legacy class i.e old class, so it is preferred not to use that instead use the dequeue class and made that to act like stack
//for implementing a queue if you are preferring to use the linkedlist then its better to use ArrayDequeue class as it claims to be faster than Linked list
public class FRW2_ArrayDequeueClass {

    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
       
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        
        dq.pollFirst();  //so it is basically a Queue i.e First in first out
        dq.pollLast();//combining it with the offerLast, we can implement stack i.e Last in first out
        
        
        
       /* dq.offerFirst(1);
        dq.offerFirst(45);
        dq.offerFirst(40);*/
        dq.forEach((x)->System.out.println(x));
        
    }
    
}
