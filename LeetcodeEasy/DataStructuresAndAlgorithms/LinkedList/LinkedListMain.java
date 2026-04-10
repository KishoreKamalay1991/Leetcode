package DataStructuresAndAlgorithms.LinkedList;

public class LinkedListMain {
   public static void main(String[] args) {
      
      LinkedListNode head = new LinkedListNode(10);
      head.next = new LinkedListNode(20);
      head.next.next = new LinkedListNode(30);
      
      while(head.next != null) {
          
          head = head.next;
          System.out.println(head.val);
      }
	  
   }
}
