package ADT;

public class stacksADT {
     static class Node{
        int val;
        Node next;
    }
    Node head,tail=null;

     Node push(int element)
     {
         Node temp=new Node();
         temp.val=element;
         temp.next=null;
         if(head==null)
         {
             head=tail=temp;
             return temp;
         }
         temp.next=head;
         head=temp;
         return temp;
     }
     Node pop()
     {
         Node temp=head;
         head=head.next;
         return temp;
     }
     int peek()
     {
         return head.val;
     }
}

