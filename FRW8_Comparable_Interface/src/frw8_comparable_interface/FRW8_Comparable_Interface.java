/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package frw8_comparable_interface;
import java.util.*;
//in FRW7 we had seen that TreeSet class was giving elements in sorted order
//but they were Integers i.e they are predefined objects 
// Now in this lecture we are going to define our own class and we would compare the objects and the order would be defined by us
//BASICALLY we are going to decide our own criteria
class Point implements Comparable{
    int x;
    int y;
    public Point(int x, int y){
          
        this.x=x;
        this.y=y;
        
    }
    public String toString(){
        return "x="+x+" y="+y; 
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point)o;
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else {
            if(this.y<p.y)
                return -1;
            else if( this.y>p.y)
                return 1;
            else 
                return 0;
        }
    }
    
}

public class FRW8_Comparable_Interface {

    
    public static void main(String[] args) {
      TreeSet<Point> ts= new TreeSet<>();
      ts.add(new Point(1,1));
      ts.add(new Point(5,5));
      ts.add(new Point(5,2));
      
      
      System.out.println("The sorted set of points are"+ts);
      
      
    }
    
}
//note 
//Comparable Interfaces are useful when you are going to implement sorted setz