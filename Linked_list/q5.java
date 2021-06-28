public class q5
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

    Node curr=head;

    while(curr!=null)
    {
        Node nextnNode=curr;
        while(nextnNode!=null&&curr.key==nextnNode.key)
        {
            nextnNode=nextnNode.next;
        }

        curr.next=nextnNode;
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
  Node head = newNode(20);
  head.next = newNode(20);
  head.next.next = newNode(15);
  head.next.next.next = newNode(4);
  head.next.next.next.next = newNode(10);
 
  Node res=rem(head);

 printList(res);
 
  
}
    

}
