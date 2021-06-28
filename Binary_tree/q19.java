public class q19
 {
     static class node
     {
         node left,right;
         int data;

         node(int data)
         {
             this.data=data;
             right=left=null;
         }
     }

     static node root;

     static int sum(node root)
     {
         if(root==null)
         return 0;

         int store_prev=root.data;
         root.data=sum(root.left)+sum(root.right);

         return root.data+store_prev;
     }

     static void print(node x)
     {
         if(x==null)
         return;

        print(x.left);
        System.out.println(x.data);
        print(x.right);
     }

     public static void main(String[] args) 
     {
         q19 tree=new q19();
        tree.root = new node(10);
        tree.root.left = new node(-2);
        tree.root.right = new node(6);
        tree.root.left.left = new node(8);
        tree.root.left.right = new node(-4);
        tree.root.right.left = new node(7);
        tree.root.right.right = new node(5);

        sum(root);

        System.out.println("the preorder traversal");
        print(root);


         
     }

    
}
