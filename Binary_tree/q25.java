public class q25
 {
     static class node 
     {
         node left,right;
         int data;
         node(int data)
         {
             this.data=data;
             left=right;
         }
     }
     static node temp=null;
     static node k_rev(node root,int  check,int k)
     {
         if(root==null)
         return null;
        
        if(root.data==check||(temp=k_rev(root.left, check,k))!=null||(temp=k_rev(root.right,check,k))!=null)
        {
            if(k>0)
            k--;

            else if(k==0)
            {
                System.out.println("kth ancestor of the node"+root.data);
                return null;
            }
            return root;
        }
        return null;


     }

     public static void main(String[] args) 
     {
         node root=new node(1);
         root.left=new node(2);
         root.right=new node(3);
         root.left.left=new node(4);
         root.left.right=new node(5);

         node store=k_rev(root, 4, 2);

         if(store==null)
         System.out.println("kth ancestor not found");
         

     }

    
}
