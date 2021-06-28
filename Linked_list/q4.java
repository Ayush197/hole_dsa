public class q4
 {
     static Node head;
     
     static class Node
{
  int key;
  Node next;
};
 
static Node newNode(int key)
{
  Node temp = new Node();
  temp.key = key;
  temp.next = null;
  return temp;
}

static Node rem(Node head)
{
    if(head==null)
    return null;

    Node curr=head,nex=null,dup=null;

    while(curr!=null)
    {
        nex=curr;
        while(nex.next!=null)
        {
            if(curr.key==nex.next.key)
            {
                dup=nex.next;
                nex.next=nex.next.next;
            
                System.gc();
            }
            else
            nex=nex.next;

        }

        curr=curr.next;
    }
    return head;

    
    
}
 
static void printList(Node head)
{
  while (head != null)
  {
    System.out.print(head.key + " ");
    head = head.next;
  }
  System.out.println();
}

     
     public static void main(String[] args)
{
  Node head = newNode(50);
  head.next = newNode(20);
  head.next.next = newNode(20);
  head.next.next.next = newNode(20 );
  head.next.next.next.next = newNode(10);
 
  Node res=rem(head);

 printList(res);
 
  
}
    

}
