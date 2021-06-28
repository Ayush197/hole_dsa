public class q8
 {
     static class node
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

     static node mirr(node nod)
     {
         if(nod==null)
         return null;

         node mirror=new node(nod.data);
         mirror.left=mirr(nod.right);
         mirror.right=mirr(nod.left);

         return mirror;


     }
     static void inorder(node nod)
     {
         if(nod==null)
         return;

         inorder(nod.left);
         System.out.println(nod.data);
         inorder(nod.right);
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

            inorder(root);
            node mirror=mirr(root);
            inorder(mirror);
     
            
            
        }
    
}
