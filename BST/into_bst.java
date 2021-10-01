import java.util.Arrays;




class into_bst 
{
    class tree
    {
        int data;
        tree left,right;
        tree(int data)
        {
            this.data=data;
            left=right=null;
        }

        
    }

   int countNodes(tree node)
   {
       if(node==null)
       return 0;

       return countNodes(node.left)+countNodes(node.right);
   }
   void  inorder(tree node,int store[],int idx)
   {
         if(node==null)
         return ;
        inorder(node.left,store,idx);
        store[idx++]=node.data;
        inorder(node.right, store, idx);


   }
   void ArraytoBst(int ar[],tree root,int idx)
   {
       if(root==null)
       return;
       ArraytoBst(ar, root.left,idx);
       root.data=ar[idx++];
       ArraytoBst(ar, root.right, idx);

   }
   void show_inorder(tree node)
   {
       if(node==null)
       return;

       show_inorder(node.left);
       System.out.println(node.data);
       show_inorder(node.right);
   }
   void into_bst_util(tree node )
   {
       int nodes[]=new int[countNodes(node)];
       Arrays.sort(nodes);

       ArraytoBst(nodes,node, 0);
       show_inorder(node);

   }
   /*
   boolean isLeftValid(tree root)
   {
       return root.left!=null;
   }
   boolean isRightValid(tree root)
   {
       return root.right!=null;
   }
   void optimized(tree node )
   {
       if(node==null)
       return;

       if(isLeftValid(node))
       {
           if(node.data<node.left.data)
           optimized(node.left);
           //swap
       }
       if(isRightValid(node))
       {
           if(node.data>node.right.data)
           optimized(node.right);
           //swap
       }
   }
   */

    


    
    public static void main(String[] args) {
        
        into_bst ob=new into_bst();

        tree root;
        root=ob.new tree(1);
        root.left=ob.new tree(2);
        root.left.left=ob.new tree(3);


    }
}