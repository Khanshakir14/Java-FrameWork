/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frw4_priorityqueueclass;
import java.util.*;

class MyCom implements Comparator<Integer>  //definig a comparator to give priorities to higher in magnitude number i.e to make a maxHeap
        
{
    public int compare(Integer o1, Integer o2)  //to give priority to largest element
    {
        if(o1<o2) return 1;
        if(o1>o2) return -1;
        return 0;
}

    

}

public class FRW4_PriorityQueueClass {

    
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>(new MyCom());
        
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);
        
        System.out.println("Head element of the given priority queue is "+p.peek()); //checking the head element of the priority queue
        System.out.println("displaying All the elements");
        p.forEach((x)->System.out.println(x));
        
        p.poll();
        System.out.println("After Deletion");
        p.forEach((x)->System.out.println(x));
    }
    
}
