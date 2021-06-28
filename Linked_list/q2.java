import java.util.Stack;

class q1_rec
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

    static node rev(node head,int k)
    {
        Stack <Integer> stack=new Stack<>();
        node curr=head,prev=null;

        int count=0;
        while(count>k&&curr!=null)
        {
            stack.push(curr.data);
            curr=curr.next;
            count++;
        }
        while(stack.size()>0)
        {
            if(prev=null)
            {
                prev=stack.peek();
                head=prev;
                stack.pop();
            }
            else
            {
                prev.next=stack.peek();
                prev=prev.next;
                stack.pop();
            }
        }
        

    }
    void printList(node nod)
    {
        while(nod!=null)
        {
            System.out.println(nod.data);
            nod=nod.next;
        }
    }
    
    public static void main(String[] args) {
        q1_rec list = new q1_rec();
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