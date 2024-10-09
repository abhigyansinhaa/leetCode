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
    static void insertAtPos(int val,int pos)
    {
        Node temp=head;
        for(int i=1;i<=pos;i++,temp=temp.next)
        {
            if(i==pos-1)
            {
                Node newNode=new Node();
                newNode.val=val;
                newNode.next=temp.next;
                temp.next=newNode;
            }
        }
    }
    Node deleteAtPos(int pos)
    {
        Node temp=head;
        for(int i=1;i<=pos-2;i++,temp=temp.next)
        {
            /*if(i==pos-1) {
                Node tempStore = temp.next;
                temp.next = tempStore.next;
                return temp;
            }*/
        }
        Node tempStore = temp.next;
        temp.next = tempStore.next;
        return temp;
    }
    void deleteAtHead()
    {
        Node temp=head;
        head=head.next;
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