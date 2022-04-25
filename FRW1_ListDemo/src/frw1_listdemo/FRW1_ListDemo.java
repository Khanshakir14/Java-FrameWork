/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frw1_listdemo;
import java.util.*;

/**
 *
 * @author shaha
 */
public class FRW1_ListDemo {

    
    public static void main(String[] args) {
        ArrayList<Integer> al1 =new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90)); //creates an array of with given elements
        
        al1.add(10);
        al1.add(0,5); //adds element 5 at index 0
        al1.addAll(1,al2); //adds all the elements of array2 between index 0 and 1
        al1.add(5,70);
        
        
        al1.set(6,100);
        
        System.out.println(al1.indexOf(70));
        System.out.println(al1);
        
        //iterating through an arraylist
        
        System.out.println("Accessing the elemnets using for loop");
            for(int i=0; i<al1.size();i++)
                System.out.println(al1.get(i));//get is used here for accessing
            
            
            System.out.println("Iterating the elements using for each loop");
            for(int x:al1)
                System.out.println(x);
            
            
            System.out.println("Iterating using iterator");
            
            Iterator<Integer> it = al1.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
            
            
            //use of ListIterator
            //ListIterator allows bi directional access
            System.out.println("Use of ListIterator");
            ListIterator<Integer> it1= al1.listIterator();
            while(it1.hasNext())
            {
                System.out.println(it1.next());
                
                
                
            }
            
            //use of for loop
            System.out.println("Accessing using for loop");
            for(ListIterator<Integer> it2= al1.listIterator(); it2.hasNext();){ //updatation is not required
                System.out.println(it2.next());
            }
            
            //use of forEach method of ArrayList class
            System.out.println("forEach method of ArrayList Class");
            al1.forEach(n->System.out.println(n));
            System.out.println("Another way to write forEach method of Arraylist is");
            al1.forEach(System.out::println);
            
            System.out.println("Calling from outside the main mehtod");
           al1.forEach(n->show(n));
            
            
            
                    
    }
    static void show(int n){   
        
        if(n>60){
            System.out.println(n);
        }
    }
    
}
