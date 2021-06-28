public class q10
{
    static class node
    {
        int data;
        node right,left;
        node(int data)
        {
            this.data=data;
            right=left;

        }
    }
    node root;
   public static  void right_display(node x)
    {
        while(x!=null)
        {
            
            System.out.println(x.data);
            x=x.right;
        }
    }
    public static void main(String[] args)
         {
            node root = new node(1);
            root.left = new node(2);
            root.right = new node(3);
            root.left.left = new node(4);
            root.right.left = new node(5);
            root.right.right = new node(6);
            root.right.left.left = new node(7);
            root.right.left.right = new node(8);
        
            right_display(root);

            

         }
    
}
