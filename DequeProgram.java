package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class DequeProgram {
	 
    private List<Integer> deque = new ArrayList<Integer>();
     
    public void insertFront(int item){
        //add element at the beginning of the queue
        System.out.println("adding at front: "+item);
        deque.add(0,item);
        System.out.println(deque);
    }
     
    public void insertRear(int item){
        //add element at the end of the queue
        System.out.println("adding at rear: "+item);
        deque.add(item);
        System.out.println(deque);
    }
     
    public void removeFront(){
        if(deque.isEmpty()){
            System.out.println("Deque underflow!! unable to remove.");
            return;
        }
        //remove an item from the beginning of the queue
        int rem = deque.remove(0);
        System.out.println("removed from front: "+rem);
        System.out.println(deque);
    }
     
    public void removeRear(){
        if(deque.isEmpty()){
            System.out.println("Deque underflow!! unable to remove.");
            return;
        }
        //remove an item from the beginning of the queue
        int rem = deque.remove(deque.size()-1);
        System.out.println("removed from rear: "+rem);
        System.out.println(deque);
    }
     
    public int peakFront(){
        //gets the element from the front without removing it
        int item = deque.get(0);
        System.out.println("Element at first: "+item);
        return item;
    }
     
    public int peakRear(){
        //gets the element from the rear without removing it
        int item = deque.get(deque.size()-1);
        System.out.println("Element at rear: "+item);
        return item;
    }
     
    public static void main(String a[]){
         
        DequeProgram deq = new DequeProgram();
        
        deq.insertFront(34);
        deq.insertFront(22);
        deq.removeRear();
        deq.insertFront(99);
        deq.insertRear(45);
        deq.removeFront();
        deq.insertFront(21);
        deq.insertFront(98);
        deq.insertRear(5);
        deq.insertFront(55);
        deq.insertFront(44);
        deq.removeRear();
        deq.insertRear(76);
        deq.insertRear(52);
        
      //  System.out.println(deq.deque);
    }
}
