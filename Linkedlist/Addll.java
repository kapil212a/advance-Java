package Linkedlist;
import java.util.*;

public class Addll {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static void addfirst(int data){                    // adding of element in linked list
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }

    public static void addlast(int data){                   //adding element in the last of the linked list
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void print(Node head){                  //printing linkedlist
        Node temp = head;
        if(temp == null){
            System.out.println("ll is empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Addll ll = new Addll();
        ll.print(head);
        ll.addfirst(2);
        ll.print(head);
        ll.addfirst(1);
        ll.print(head);
        ll.addlast(3);
        ll.print(head);
        ll.addlast(4);
        ll.print(head);
    }

}
