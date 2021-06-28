public class q11
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
    
    static void add(node head)
    {
        node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.data+=1;

    }
     
    static void print(node head)
    {
        node r=head;
        while(r!=null)
        {
            System.out.println(r.data+"  ");
            r=r.next;
        }
    }
    public static void main(String[] args) {
        q11 list=new q11();
        list.head=new node(1);
        list.head.next=new node(2);
        list.head.next.next=new node(3);
        add(head);
        print(head);

    }   
}
