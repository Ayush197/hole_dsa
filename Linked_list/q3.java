public class q3
{
    static node head;
   static class node
    {
        int data;
        node next;
        node(int d)
        {
            data=d;
            next=null;
        }
    }

    static int detectloop(node head)
    {
        node start=head,fast=head;

        while(fast.next!=null&&start!=null&&fast!=null)
        {
            start=start.next;
            fast=fast.next.next;

            if(start==fast)
            {
                remove(start,head);
                return 1;
            }
        }
        return 0;
    }

    static  void remove(node start,node curr)
    {
        node p=null,q=null;
        p=curr;
        while(true)
        {
            q=start;
            while(q.next!=start&&q.next!=p)
            {
                q=q.next;
            }
            if(q.next==p)
            break;

            p=p.next;
        }
        q.next=null;
    }
   void printList( node nod)
    {
        while (nod != null) {
            System.out.print(nod.data + " ");
            nod = nod.next;
        }
    } 
    public static void main(String[] args)
    {
        q3 list = new q3();
        list.head = new node(50);
        list.head.next = new node(20);
        list.head.next.next = new node(15);
        list.head.next.next.next = new node(4);
        list.head.next.next.next.next = new node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
        list.detectloop(head);
        System.out.println(
            "Linked List after removing loop : ");
        list.printList(head);
    }            
}
