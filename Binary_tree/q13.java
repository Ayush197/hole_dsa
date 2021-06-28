public class q13 
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

    static node root;
    static void boundary_left(node z)
    {
        if(z==null)
        return;

        if(z.left!=null)
        {
            System.out.println(z.data);
            boundary_left(z.left);
        }
        else if(z.right!=null)
        {
            System.out.println(z.data);
            boundary_left(z.right);
        }
    }
    
    static void boundary_right(node z)
    {
        if(z==null)
        return;

        if(z.right!=null)
        {
            
            boundary_left(z.left);
            System.out.println(z.data);
        }
        else if(z.left!=null)
        {
            
            boundary_left(z.right);
            System.out.println(z.data);
        }
    }

    static void boundary_leaves(node z)
    {
        if(z==null)
        return;

        boundary_leaves(z.left);
        if(z.left==null&&z.right==null)
        System.out.println(z.data);
        boundary_leaves(z.right);
    }

    static void print_boundary(node z)
    {
        if(root==null)
        return;

    
        System.out.println(z.data);
        boundary_left(z.left);

        boundary_leaves(z.left);
        boundary_leaves(z.right);

        boundary_right(z.right);
    }
    public static void main(String args[])
    {
        q13 tree = new q13();
        tree.root = new node(20);
        tree.root.left = new node(8);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(12);
        tree.root.left.right.left = new node(10);
        tree.root.left.right.right = new node(14);
        tree.root.right = new node(22);
        tree.root.right.right = new node(25);

        print_boundary(root);
        

    }
    
}
