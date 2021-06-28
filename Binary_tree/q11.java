import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class q11
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
  static  node root;
    static class binary
    {
        public binary()
        {
            root=null;
        }
        private void top(node root)
        {
            
    
            class q
            {
                int h;
                node x;
                q(int h,node x)
                {
                    this.x=x;
                    this.h=h;
                }
            }
            Queue<q> que=new LinkedList<q>();
            Map<Integer,node> map=new TreeMap<Integer,node>();
            
            if(root==null)
            return;
            else
            que.add(new q(0,root));

            System.out.println("Enter the ");

            
            
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
        
            top_display(root);

            

         }
    
}
