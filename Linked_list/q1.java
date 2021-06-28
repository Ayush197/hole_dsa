

class linkedlist
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

    node rev(node nod)
    {
        node prev=null,curr=nod,next=null;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        nod=prev;
        return nod;
        
    }
    void printList(node nod)
    {
        while(nod!=null)
        {
            System.out.println(nod.data+" ");
            nod=nod.next;

        }
    }
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.head = new node(85);
        list.head.next = new node(15);
        list.head.next.next = new node(4);
        list.head.next.next.next = new node(20);
 
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.rev(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
