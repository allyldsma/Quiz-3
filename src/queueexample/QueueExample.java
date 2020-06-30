
package queueexample;

import java.util.logging.Level;
import java.util.logging.Logger;
import Singlylinkedlist.SNode;


public class QueueExample {

    
    public static void main(String[] args) {

        // TODO code application logic here
        Student s1 = new Student(11, "Clare");
        Student s2 = new Student(19, "Yannie");
        Student s3 = new Student(13, "Mimi");
        Student s4 = new Student(15, "Nina");
        Student s5 = new Student(10, "Ritchel");

        SNode<Student> student1 = new SNode<>(s1, null);
        SNode<Student> student2 = new SNode<>(s2, null);
        SNode<Student> student3 = new SNode<>(s3, null);
        SNode<Student> student4 = new SNode<>(s4, null);
        SNode<Student> student5 = new SNode<>(s5, null);
               
       QueueList<SNode> transaction = new QueueList<>();
        transaction.enqueue(student1);
        transaction.enqueue(student2);
        transaction.enqueue(student3);
        transaction.enqueue(student4);
        transaction.enqueue(student5);
      
        
        try {
            displayTransactions(transaction);
            transaction.dequeue();
            System.out.println("\nAfter Dequeue");
            
            displayTransactions(transaction);
            
            transaction.dequeue();
            System.out.println("\nAfter Dequeue");
            displayTransactions(transaction);
          
            
            
        } catch (EmptyQueueException ex) {
            Logger.getLogger(QueueExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static void displayTransactions(QueueList<SNode> queueList ) throws EmptyQueueException{
        SNode<Student> temp = queueList.List();
        for(int i = 0; i < queueList.size(); i++) {
            System.out.println("Transaction No." + (i + 1) + ": " + temp.getElement().getName() +
                   ",Student ID: " + temp.getElement().getCustomerID());
        temp = temp.getNext();
    }
    }
}


 
