package ADT;

public class queuesADT {
    int size=5;
    public int[] queue=new int[size];

    int front=-1,rear=-1;
    void enQueue(int val)
    {
        if(front==-1 || front>rear)
        {
            System.out.println("Queue is empty.");
            front=rear=0;
            queue[rear]=val;
        }
        else if(rear==size-1)
        {
            System.out.println("Queue is full.");
            return;
        }
        else {
            queue[rear++]=val;
        }
    }
    int deQueue()
    {
        int temp=queue[front];
        front++;
        return temp;
    }
    void traverse()
    {
        for(int i=front;i<=rear;i++)
            System.out.print(i);
    }
}
