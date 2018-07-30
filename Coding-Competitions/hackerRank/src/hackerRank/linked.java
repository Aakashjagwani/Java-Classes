package hackerRank;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;
 }

public class linked {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	Node n = new Node();
	Node head = new Node(); 
	for(int i = 0 ;i<s ;i++) {
		int m = sc.nextInt();
		for(int j = 0 ;j<m ;j++) {
			int z = sc.nextInt();
			head = SortedInsert(n,z); 
		}
		for(Node current = head;current!=null ;current = current.next) {
			System.out.println(n.data);
		}
	}
	sc.close();		
	}
	static Node SortedInsert(Node head,int data) {
	    Node toBeinserted = new Node();
	    Node current = head,previous = head ; 
	    toBeinserted.data = data ;
	    if(current == null ){
	       head = toBeinserted ;
	       return head;
	    }
	    if(current.next == null){
	        if(current.data > data){
	            head = toBeinserted ;
	            toBeinserted.next = current ;
	            toBeinserted.prev = null;
	            current.prev = toBeinserted;
	            current.next  =null;
	            return head;
	            
	        }else{
	            current.next = toBeinserted;
	            toBeinserted.prev = current;
	            toBeinserted.prev = null;
	            current.prev = null ;
	            head = current;
	            return head;
	        }
	    }
	    while(current.data>data && previous.data < data )
	    {
	        previous = current;
	        current = current.next;
	    }
	    toBeinserted.prev = previous;
	    previous.next = toBeinserted;
	    toBeinserted.next = current;
	    current.prev = toBeinserted ; 
	    
	  return head;
	}
}
