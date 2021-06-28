public class q10
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
    void tofirst()
    {
        if(head!=null&&head.next!=null)
        return;

        node sec_last=null,last=head;
        while(last.next!=null)
        {
            sec_last=last;
            last=last.next;
        }
        sec_last.next=null;
        last.next=head;

        last=head;
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
        q10 list = new q10();
        list.head = new node(50);
        list.head.next = new node(20);
        list.head.next.next = new node(15);
        list.head.next.next.next = new node(4);
        list.head.next.next.next.next = new node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
    
        list.tofirst();
        //System.out.println(head);
        
        list.printList(head);
    }            
}
