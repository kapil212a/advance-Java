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

    public static void addMid(Node head ,int data, int idx){          // Adding Element in the last of linked list
        if(idx == 0){
            addfirst(data);
            return;
        }
        Node temp = head;
        int i =0;
        Node newNode = new Node(data);
        while(i < idx-1 ){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    

    public static void main(String[] args) {
        Addll ll = new Addll();
        ll.addfirst(2);
        ll.addfirst(1);

        ll.addlast(3);
        ll.addlast(4);

        ll.print(head);

        ll.addMid(head, 5, 2);
        ll.print(head);


    }

}
