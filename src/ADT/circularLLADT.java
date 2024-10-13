package ADT;

public class circularLLADT {
    public static class Node {
        int val;
        Node next;
    }
    static Node head,tail;
    static void insertAtEnd(int element)
    {
        Node temp=new Node();
        temp.val = element;
        temp.next=head;
        if(head==null)
        {
            head=tail=temp;
            return;
        }
        tail.next=temp;
        tail=temp;
    }
    static void traverse()
    {
        Node temp=head;
        do{
            System.out.print(temp.val+" ");
            temp=temp.next;
        }while(temp!=head);
    }
}
