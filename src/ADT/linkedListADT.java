package ADT;
public class linkedListADT {
    public static class Node {
        int val;
        Node next;
    }
    static Node head,tail;
    static void insertAtEnd(int element)
    {
        Node temp=new Node();
        temp.val = element;
        temp.next=null;
        if(head==null)
        {
            head=tail=temp;
            return;
        }
        tail.next=temp;
        tail=temp;
    }
    static void insertAtHead(int val)
    {
        Node temp = new Node();
        temp.val=val;
        temp.next=null;
        if(head==null)
        {
            head=tail=temp;
        }
        temp.next=head;
        head=temp;
    }
    static void traverse()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}