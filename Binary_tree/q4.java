class q4
{
   static class node
{
    node left,right;
    int data;

    node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
public static class binary_class
{
    node root;
    
    int diameter(node root)
    {
        if(root==null)
        return 0;

        int left=height(root.left),right=height(root.right);
         
        int Left_diameter=diameter(root.left),right_diameter=diameter(root.right);

        return Math.max(left+right, Math.max(Left_diameter,right_diameter));
        
    }
    int diameter()
    {
        return diameter(root);
    }
    int height(node nod)
    {
        if(nod==null)
        return 0;

        return (1+Math.max(height(nod.left),height(nod.right)));
    }
    
    
   }
   public static void main(String args[]) 
   {
       binary_class tree = new binary_class();
  
       // Let us create trees shown in above diagram
       tree.root = new node(1);
       tree.root.left = new node(2);
       tree.root.right = new node(3);
       tree.root.left.left = new node(4);
       tree.root.left.right = new node(5);
       tree.root.right.left = new node(6);
       tree.root.right.right = new node(7);
  
       System.out.println("The height of the tree " +tree.diameter(tree.root));
       
  
   }


}