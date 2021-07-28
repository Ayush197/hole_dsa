public class remove_node 
{
    class node
    {
        int data;
        node left,right;
        node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    node root;

    void util_insert(int val)
    {
        root=insert(root, val);
    }
   node insert(node root,int val)
   {
       if(root==null)
       {
           return root=new node(val);
       }

       if(val<root.data)
       root.left=insert(root.left, val);
       else if(val>root.data)
       root.right=insert(root.right,val);

       return root;
   }
   void util_delete(int val)
   {
      if(search(root, val))
      {
      root=delete(root,val);
      return;
      }
    
      System.out.println("value not found");



      
   }
   node delete(node root,int val)
   {
       if(root==null)
       return root;;

       if(val<root.data)
       root.left=delete(root.left, val);
       else if(val>root.data)
       root.right=delete(root.right, val);
       //found value
       else
       {
           //case 1 : there is just one child present
           if(root.left==null)
           return root.right;
           else if(root.right==null)
           return root.left;
           //case 2 : two children present
           //get the minimum value
           root.data=leastValue(root.right);
           //
           root.right=delete(root.right, root.data);
       }
       return root;


   }
   int leastValue(node root)
   {
       int least_val=root.data;
       while(root.left!=null)
       {
           least_val=root.left.data;
           root=root.left;

       }
       return least_val;
   }
   boolean search(node root,int val)
   {
       if(root==null)
       {
           return false;
       }

       if(root.data==val)
       {
           return true;
       }
       else if(val<root.data)
       return search(root.left, val);
       else
       return search(root, val);

   }

   remove_node()
   {
       root=null;
   }
   void inorder(node root)
   {
       if(root==null)
       return;

       inorder(root.left);
       System.out.println(root.data);
       inorder(root.right);
   }

   public static void main(String[] args) {
       
    remove_node ob=new remove_node();
    
    ob.util_insert(1);
    ob.util_insert(2);
    ob.util_insert(3);
    System.out.println("BST before deletion");
    ob.inorder(ob.root);
    System.out.println("After deletion");

    ob.util_delete(1);
    ob.inorder(ob.root);
   }
    
}
