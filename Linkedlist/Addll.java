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
    public static int size;
    public static void addfirst(int data){                    // adding of element in linked list
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }

    public static void addlast(int data){                   //adding element in the last of the linked list
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void print(){                  //printing linkedlist
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
        size++;
        while(i < idx-1 ){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static int removeFirst(){
        if(size == 0){
            System.out.println(" ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public static int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail  = prev;
        return val;

    }

    public static int searchKey(int key){
        Node temp = head;
        int pos = 0;
        while(temp != null){
            if(temp.data == key){
                return pos;
            }
            temp = temp.next;
            pos++;
        }
        return -1;
    }

    public static int helper(Node head , int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }

    public static int recorsiveSearch(int key){
        return helper(head , key);
    }

    public static void reverseLL(){
        Node curr = head , prev = null , next;
        while(curr != null){
            next = curr.next;
            curr.next  = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void deletefmEnd(int idx){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        int i=1;
        int nth = sz - idx;
        Node prev = head;
        while(i<nth){
            prev = prev.next;
            i++;

        }
        prev.next = prev.next.next;
        return;

    }

    public static Node findMid(Node head){
        Node slow = head , fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean checkPalindrom(){

        if(head == null || head.next == null){
            return true;
        }
        Node mid = findMid(head);
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while(right != null ){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
   
   } 

    

    public static void main(String[] args) {
        Addll ll = new Addll();
        // ll.addfirst(3);
        // ll.addfirst(1);
        // ll.addfirst(0);

        // ll.addlast(4);
        // ll.addlast(5);
        // ll.addlast(6);
        // ll.addlast(7);

        // ll.print();

        // ll.addMid(head, 2, 2);
        // ll.print();
        // System.out.println(ll.size);

        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.size);

        // ll.removeLast();
        // ll.print();

        // System.out.println(ll.searchKey(4));

        // System.out.println(ll.recorsiveSearch(3));

        // ll.reverseLL();
        // ll.print(); 

        // ll.deletefmEnd(6);
        // ll.print();

        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.print();
        System.out.println(ll.checkPalindrom());


    }

}
