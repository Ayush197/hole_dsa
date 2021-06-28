
    class  node
    {
        node right,left;
        int data;
        public node(int data)
        {
            this.data=data;
            right=left=null;
        }

    }

 class binary__
    {
       node head, prev=null, root;

        public  void  todoubly_linkedlist(node root)
        {
            if(root==null)
            return;

            todoubly_linkedlist(root.left);

            if(prev==null)
            head=root;
            else
            {
              root.left=prev;
              prev.right=root;
            }
            prev=root;

            todoubly_linkedlist(root.right);

            

        }

        public void print(node x)
        {
            if(x==null)
            return;
            System.out.print(x.data+" ");
            x=x.right;
        }
    


    
    
    
    public static void main(String[] args) 
    {
         binary__ tree = new binary__();
        tree.root = new node(10);
        tree.root.left = new node(12);
        tree.root.right = new node(15);
        tree.root.left.left = new node(25);
        tree.root.left.right = new node(30);
        tree.root.right.left = new node(36);

        tree.todoubly_linkedlist(tree.root);
        
        //printing list
        tree.print(tree.head);
 
        
    }
}