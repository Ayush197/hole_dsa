public class lca 
{
    class node 
    {
        int data;
        node right,left;
        node(int data)
        {
            this.data=data;
            right=left=null;
        }
    }
    node root;
    void insert(int val)
    {
        root=util_insert(root,val);
    }
    private lca.node util_insert(node root, int val) 
    {
        if(root==null)
        return root=new node(val);

        if(val<root.data)
        root.left=util_insert(root.left, val);
        else if(val>root.data)
        root.right=util_insert(root.right, val);

        return root;
    }
    //use the properties of BST i.e. left node.data is always smalller than root 
    //right node.data is  greater(than root).
    node find_lca(node root,int val1,int val2)
    {
        if(root==null)
        return root;
        
        //if both value is less 'root.data' then lca lies in left 
        //subtree
        if(val1<root.data&&val2<root.data)
        return find_lca(root.left, val1, val2);
        //if both value is greater than root.data then lca lies
        // in the right subtree;
        else if(val1>root.data&&val2>root.data)
        return find_lca(root.right, val1, val2);

        //if values lies in the different subtree 
        //it will the return the common ancestor.
        return root;

    }
    public static void main(String[] args) {
        
        lca ob=new lca();

        //insert values 
        ob.insert(1);
        ob.insert(2);
        ob.insert(34);
        ob.insert(43);

       node lca_node= ob.find_lca(ob.root, 34, 43);
       System.out.println("The commmon ancestor is " + lca_node.data);
       
    }

    
}
