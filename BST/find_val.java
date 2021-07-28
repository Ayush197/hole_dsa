class find_val
{ 
    class node
    {
        int data;
        node left,right;
        node(int val)
        {
            this.data=val;
            left=right=null;
        }
        

        
    }
    node root;
    
    void util_insert(int val)
    {
       root= insert(root,val);
    }
    node insert(node root,int key)
    {
        if(root==null)
        {
        root=new node(key);
        return root;
        }


        if(key<root.data)
        {
            root.left=insert(root.left, key);
        }
        else if(key>root.data)
        root.right=insert(root.right, key);

        return root;

    
    }
    boolean isEmpty(node root)
    {
        return root==null;
    }
    void inorder(int val)
    {
        inorder_search(root, val);
    }
    void inorder_search(node root,int val)
    {
        if(isEmpty(root))
        {
            System.out.println("Value not found");
        return;

        }

        if(root.data==val)
        {
           System.out.println("Value found");
           return;
        }
        if(val<root.data)
        inorder_search(root.left, val);
        else if(val>root.data)
        inorder_search(root.right, val);

    
    }
     

     public static void main(String[] args)
     {
         find_val ob=new find_val();

         
         
        ob.util_insert( 1);
        ob.util_insert(2);
        ob.util_insert(69);

         ob.inorder(69);


        
     }
}