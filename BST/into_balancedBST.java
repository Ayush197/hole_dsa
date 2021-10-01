
class into_balancedBST extends into_bst
{   
    
    
    void inorder_storing(int ar[],tree node,int idx)
    { 
        if(node==null)
        return;
        inorder_storing(ar, node.left, idx);
        ar[idx++]=node.data;
        inorder_storing(ar, node.right, idx);

    }
    void left(int store[],int mid,tree root)
    {
        if(root==null)
        return;

        root.data=store[--mid];
        left(store, mid, root.left);

    }
    void right(int store[],int mid,tree root)
    {
        if(root==null)
        return;

        root.data=store[++mid];
        left(store, mid, root.right);
    }
    void util(tree root)
    {
       int n=countNodes(root);
       int store[]=new int[n];
       inorder(root, store, 0);

       int mid=n/2;
       root.data=store[mid];
       left(store, mid, root.left);
       right(store, mid, root.right);


    }

    public static void main(String[] args) {
        
        into_balancedBST ob=new into_balancedBST();

        tree root=ob.new tree(3);
        root.left=ob.new tree(2);
        root.left=ob.new tree(1);
        
    }
}