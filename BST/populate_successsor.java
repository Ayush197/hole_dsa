public class populate_successsor {
    
    class node{

        int data;
        node left,right,next;
        node(int data)
        {
            this.data=data;
            left=right=next=null;
        }
    }
    node root;
    void insert(int val)
    {
        root=util_insert( root,val);
    }
    node util_insert(node root,int val)
    {
        if(root==null)
        return root=new node(val);

        if(val<root.data)
        root.left=util_insert(root.left,val);
        else if(val>root.data)
        root.right=util_insert(root.right, val);

        return root;  
    }
    node populateInorderSuccessor(node root, node next_node)
    {
        if(root==null)
         return root;

         populateInorderSuccessor(root.right,next_node);

         root.next=next_node;
         next_node=root;

        populateInorderSuccessor(root.left,next_node);

       return root;



        
    }

    void inorder(node root)
    {
        if(root==null)
        return;

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    void get_next(node temp)
    {
        int get=temp.next!=null?temp.next.data:-1;
        System.out.println("next of " +temp.data +" "+get );
        get_next(temp.next);
    }
    public static void main(String[] args) 
    {
        populate_successsor ob=new populate_successsor();

        ob.insert(1);
        ob.insert(2);
        ob.insert(3);

        node next_node=null;
        node fin=ob.populateInorderSuccessor(ob.root,next_node);

       

        
    }
}
