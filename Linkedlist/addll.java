package Linkedlist;
import java.util.*;

public class addll {
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

        public static void printLL(Node head){                  //printing linkedlist
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                head = temp.next;
            }
        }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);

        ll.addLast(3);
        ll.addLast(4);
    }

}
